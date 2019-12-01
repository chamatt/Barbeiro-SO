
public class Barbearia {
	private FilaSincronizada<Cliente> clientesNaFila;
	
	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}
	
	public boolean cortaCabelo(Cliente c) { 
		try {
			
		}catch(InterruptedException e){
			
		}
	}

	public Cliente proximoCliente() {
		return clientesNaFila.remover();
	}

	public void corteTerminado(Cliente c) { 
		
		
	}
}
