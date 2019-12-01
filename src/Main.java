
public class Main {

	public static void main(String[] args) {
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
