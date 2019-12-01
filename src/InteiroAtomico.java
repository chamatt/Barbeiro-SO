
public class InteiroAtomico {
	int inteiro = 0;
	
	public synchronized int get () {
		return inteiro;
	}
	
	public synchronized void set (int valor) {
		inteiro = valor;
	}
	
	public synchronized void increment() {
		inteiro++;
	}
	
	public synchronized int incrementAndGet() {
		increment();
		return get();
	}
}
