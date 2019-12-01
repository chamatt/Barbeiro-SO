import java.util.*;

public class Main {
	public static void main(String[] args) {

		// Armazenando os dados da linha de comando
		int qtdBarbeiros = Integer.parseInt(args[0]);
		int qtdCadeiras = Integer.parseInt(args[1]);
		int qtdClientes = Integer.parseInt(args[2]);

		Barbearia barbearia = new Barbearia(qtdCadeiras);
		List<Cliente> listaDeClientes = new ArrayList<Cliente>();
		List<Barbeiro> listaDeBarbeiros = new ArrayList<Barbeiro>();

		for(int i = 0; i < qtdBarbeiros ; i++) {
			Barbeiro barbeiro = new Barbeiro(barbearia);
			listaDeBarbeiros.add(barbeiro);
			Thread t = new Thread(barbeiro);
			t.start();
//			System.out.println("Barbeiro id: " + barbeiro.getID());
		}
		
		
		
		// Criando os clientes
		for (int i = 0; i < qtdClientes; i++) {
			Cliente cliente = new Cliente(barbearia);
			listaDeClientes.add(cliente);
			Thread t = new Thread(cliente);
			t.start();
//			System.out.println("Cliente id: " + cliente.getID());
		}

		
	
	}
}