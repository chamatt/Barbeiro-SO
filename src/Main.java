public class Main {
	public static void main(String[] args) {
		 int qtdBarbeiros = Integer.parseInt(args[0]);
		 int qtdCadeiras = Integer.parseInt(args[1]);
		 int qtdClientes = Integer.parseInt(args[2]);
		for(int i = 0; i < 10 ; i++) {
			Cliente cliente = new Cliente();
			System.out.println("Cliente id: " + cliente.getID());
		}
		for(int i = 0; i < 10 ; i++) {
			Barbeiro cliente = new Barbeiro();
			System.out.println("Barbeiro id: " + cliente.getID());
		}
	}
}