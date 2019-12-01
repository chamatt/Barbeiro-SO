
public class Cliente extends Pessoa implements Runnable {
	static InteiroAtomico tID = new InteiroAtomico();
	private FilaSincronizada<Boolean> lock = new FilaSincronizada<Boolean>(1);
	Barbearia barbearia;
	public boolean cortou = false;
	
	public Cliente(Barbearia barbearia) {
		super();
		this.id = tID.incrementAndGet();
		this.barbearia = barbearia;
	}

	public void run() {
		while (!cortou) {
			try {
				int tempoDeCorte = gerarNumeroNoIntervalo(3000, 5000);
				Thread.sleep(tempoDeCorte);
				cortou = barbearia.cortaCabelo(this);
				if (cortou) {
					System.out.println(String.format("%s terminou o corte... saindo da barbearia", this));
					break;
				} else {
					System.out.println(String
							.format("%s tentou entrar na barbearia, mas está lotada... indo dar uma voltinha", this));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void esperarCorteCompletar() {
		lock.remover();
	}

	public void completarCorte() {
		lock.inserir(true);
	}

	@Override
	public String toString() {
		return "Cliente " + getID();
	}

}
