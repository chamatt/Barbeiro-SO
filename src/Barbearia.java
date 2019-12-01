
public class Barbearia {
	public FilaSincronizada<Cliente> clientesNaFila;

	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}
	
	synchronized public boolean cortaCabelo(Cliente cliente) { 
		if(clientesNaFila.isFull()) {
			System.out.println(String.format("%s tentou entrar na barbearia, mas está lotada... indo dar uma voltinha", cliente));
			return false;
		}
		
		System.out.println(String.format("%s esperando corte...", cliente));
		clientesNaFila.inserir(cliente);
		cliente.esperarCorteCompletar();
		return true;
	}

	synchronized public Cliente proximoCliente() {
		Cliente cliente = clientesNaFila.remover();
		return cliente;
	}

	synchronized public void corteTerminado(Cliente cliente) {
		cliente.completarCorte();
		System.out.println(String.format("%s terminou o corte... saindo da barbearia", cliente));
	}
}
