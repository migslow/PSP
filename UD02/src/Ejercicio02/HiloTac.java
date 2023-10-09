package Ejercicio02;

public class HiloTac implements Runnable {
	
	public HiloTac() {
		super();
	}

	public void run() {
		do {
			System.out.println("Tac");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);

	}
}
