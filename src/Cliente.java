
public class Cliente extends Pessoa implements Runnable{
	static InteiroAtomico tID = new InteiroAtomico();
	Barbearia barbearia;
	
	public Cliente() {
		super();
		this.id = tID.incrementAndGet();
	}
	
	public void run() {
		while(true) {
			try {
				int sleepTime = (int)(Math.random() * 3) + 3;
				Thread.sleep(sleepTime*1000);
			}catch(Exception e) {}
		}
	}
	
}
