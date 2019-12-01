
public class Barbeiro extends Pessoa {
	static InteiroAtomico tID = new InteiroAtomico();

	public Barbeiro() {
		super();
		this.id = tID.incrementAndGet();
	}
}
