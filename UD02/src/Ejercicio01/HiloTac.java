package Ejercicio01;

public class HiloTac extends Thread {
	public HiloTac() {
		super();
	}

	public void run() {
		do {
			System.out.println("Tic");
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);

	}
}
