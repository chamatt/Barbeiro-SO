
public class Cliente extends Pessoa implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	private FilaSincronizada<Boolean> lock = new FilaSincronizada<Boolean>(1);
	Barbearia barbearia;
	
	public Cliente(Barbearia barbearia) {
		super();
		this.id = tID.incrementAndGet();
		this.barbearia = barbearia;
	}
	
	public void run() {
			try {
				int tempoDeCorte = gerarNumeroNoIntervalo(3000,5000);
				Thread.sleep(tempoDeCorte);
				barbearia.cortaCabelo(this);
				
			}catch(InterruptedException e) {}
		
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
