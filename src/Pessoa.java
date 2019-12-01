
public class Pessoa {
	protected int id;

	public int getID() {
		return this.id;
	}
	
	public int gerarNumeroNoIntervalo(int min, int max) {
		return (int)(Math.random() * ((max - min) + 1)) + min;
	}
}
