
public class Cliente extends Pessoa {
	static InteiroAtomico tID = new InteiroAtomico();
	
	public Cliente() {
		super();
		this.id = tID.incrementAndGet();
	}
	
}
