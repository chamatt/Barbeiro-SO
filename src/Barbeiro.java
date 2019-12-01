
public class Barbeiro extends Pessoa  implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	private Barbearia barbearia;
	private boolean cortar = true;
	
	public Barbeiro(Barbearia barbearia) {
		super();
		this.id = tID.incrementAndGet();
		this.barbearia = barbearia;
	}

	public void run() {
		while (true) {
			try {
				if(barbearia.clientesNaFila.isFull()) System.out.println(String.format("%s indo dormir um pouco… não há clientes na barbearia...", this));
				Cliente cliente = barbearia.proximoCliente();
				System.out.println(String.format("%s acordou! Começando os trabalhos!", this));
				System.out.println(String.format("%s cortando cabelo com %s", cliente, this));
				int tempoDeCorte = gerarNumeroNoIntervalo(3000,5000);
				Thread.sleep(tempoDeCorte);
				barbearia.corteTerminado(cliente);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	@Override 
	public String toString() {
		return "Barbeiro " + getID();
	}
	
}
