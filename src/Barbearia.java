
public class Barbearia {
	private FilaSincronizada<Cliente> clientesNaFila;
	
	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}
	
	public boolean cortaCabelo(Cliente c) { 
		return true; //TODO
	}

	public Cliente proximoCliente() {
		return null; //TODO
	}

	public void corteTerminado(Cliente c) { 
		
		
	}
}
