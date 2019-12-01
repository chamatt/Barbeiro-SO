
public class Barbearia {
	private FilaSincronizada<Cliente> clientesNaFila;
	
	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}
	
	public boolean cortaCabelo(Cliente c) { 
		return true; //TODO
	}

	synchronized public Cliente proximoCliente() {
		return clientesNaFila.remover();
	}

	synchronized public void corteTerminado(Cliente cliente) { 
		System.out.println(String.format("%s terminou o corte... saindo da barbearia", cliente));
//		cliente.finalizouCorte();
	}
}
