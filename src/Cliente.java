
public class Cliente extends Pessoa implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	Barbearia barbearia;
	
	public Cliente(Barbearia barbearia) {
		super();
		this.id = tID.incrementAndGet();
		this.barbearia = barbearia;
	}
	
	public void run() {
		while(true) {
			try {
				int tempoDeCorte = gerarNumeroNoIntervalo(3000,5000);
				Thread.sleep(tempoDeCorte);
				barbearia.cortaCabelo(this);
			}catch(InterruptedException e) {}
		}
	}
	
	@Override
	public String toString() {
		return "Cliente " + getID();
	}
	
}
