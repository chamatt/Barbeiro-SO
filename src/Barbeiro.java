
public class Barbeiro extends Pessoa  implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	private Barbearia barbearia;
	private boolean cortar = true;
	
	public Barbeiro(Barbearia barbearia) {
		super();
		this.id = tID.incrementAndGet();
		this.barbearia = barbearia;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Cliente cliente =  barbearia.proximoCliente();
				int tempoDeCorte = gerarNumeroNoIntervalo(3,5);
				Thread.sleep(tempoDeCorte);
				barbearia.corteTerminado(cliente);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}
