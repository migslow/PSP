package ejemplo03_Yield;

public class Hilo extends Thread {

	public Hilo(String string) {
		super();
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " " + getName());
			Thread.yield();
		}

		System.out.println("Fin " + getName());
	}
}
