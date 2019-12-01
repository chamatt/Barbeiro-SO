
public class Cliente extends Pessoa implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	
	public Cliente() {
		super();
		this.id = tID.incrementAndGet();
	}
	
	public void run() {
		System.out.println("Cliente " + this.getID() + " is running");
	}
	
}
