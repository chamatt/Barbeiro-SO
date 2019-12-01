import java.util.*; 

public class Main {
	public static void main(String[] args) {
		
		//Armazenando os dados da linha de comando
		 int qtdBarbeiros = Integer.parseInt(args[0]);
		 int qtdCadeiras = Integer.parseInt(args[1]);
		 int qtdClientes = Integer.parseInt(args[2]);
		 
		 Barbearia barbearia = new Barbearia(qtdCadeiras);
		 List<Cliente> listaDeClientes = new ArrayList<Cliente>(); 
		 
		 //Criando os clientes
		for(int i = 0; i < qtdClientes ; i++) {
			Cliente cliente = new Cliente(barbearia);
			listaDeClientes.add(cliente);
			System.out.println("Cliente id: " + cliente.getID());
		}
		
		//Criando as threads dos clientes e executando-as
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