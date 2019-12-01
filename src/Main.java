import java.util.*; 

public class Main {
	public static void main(String[] args) {
		 int qtdBarbeiros = Integer.parseInt(args[0]);
		 int qtdCadeiras = Integer.parseInt(args[1]);
		 int qtdClientes = Integer.parseInt(args[2]);
		 List<Cliente> listaDeClientes = new ArrayList<Cliente>(); 
		 
		for(int i = 0; i < qtdClientes ; i++) {
			Cliente cliente = new Cliente();
			listaDeClientes.add(cliente);
			System.out.println("Cliente id: " + cliente.getID());
		}
		
		for(int i = 0; i < qtdClientes;i ++) {
			Thread t = new Thread(listaDeClientes.get(i));
			t.start();
		}
		
//		for(int i = 0; i < 10 ; i++) {
//			Barbeiro cliente = new Barbeiro();
//			System.out.println("Barbeiro id: " + cliente.getID());
//		}
	}
}