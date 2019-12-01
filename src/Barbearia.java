
public class Barbearia {
	public FilaSincronizada<Cliente> clientesNaFila;

	public Barbearia(int assentos) {
		this.clientesNaFila = new FilaSincronizada<Cliente>(assentos);
	}

	public boolean cortaCabelo(Cliente cliente) {
//		System.out.println(cliente + " entrou na barbearia");
		if (clientesNaFila.isFull()) {
			return false;
		}
		clientesNaFila.inserir(cliente);
		System.out.println(String.format("%s esperando corte...", cliente));
		cliente.esperarCorteCompletar();
		return true;
	}

	public Cliente proximoCliente() {
		Cliente cliente = clientesNaFila.remover();
		return cliente;
	}

	public void corteTerminado(Cliente cliente) {
		cliente.completarCorte();
	}
}
