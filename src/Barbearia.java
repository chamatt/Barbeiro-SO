
public class Barbearia {
	private FilaSincronizada<Cliente> clientesNaFila;
	
	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}
	
	synchronized public boolean cortaCabelo(Cliente cliente) { 
		if(clientesNaFila.isFull()) {
			// do something
		}
		clientesNaFila.inserir(cliente);
		cliente.esperarCorteCompletar();
		return true;
	}

	synchronized public Cliente proximoCliente() {
		return clientesNaFila.remover();
	}

	synchronized public void corteTerminado(Cliente cliente) { 
		cliente.completarCorte();
		System.out.println(String.format("%s terminou o corte... saindo da barbearia", cliente));
	}
}
