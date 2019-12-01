import java.util.LinkedList;
import java.util.Queue;

public class FilaSincronizada<T> {
	public Queue<T> fila = new LinkedList<T>();
	public int capacidade;

	public FilaSincronizada(int capacidade) {
		this.capacidade = capacidade;
	}

	public synchronized T remover() {
		while (this.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				return null;
			}
		}
		T elemento = fila.remove();
		return elemento;
	}

	public synchronized void inserir(T elemento) {
		while (this.isFull()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		System.out.println(elemento + " entrou na fila.");
		fila.add(elemento);
		notifyAll();
	}

	public boolean isFull() {
		synchronized (fila) {
			if (fila.size() == capacidade) {
				return true;
			}
			return false;
		}

	}

	public boolean isEmpty() {
		synchronized (fila) {
			if (fila.size() == 0) {
				return true;
			}
			return false;
		}

	}
}
