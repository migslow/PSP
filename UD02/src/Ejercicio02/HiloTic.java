package Ejercicio02;

public class HiloTic implements Runnable {

	public HiloTic() {
		super();
	}

	public void run() {
		do {
			System.out.println("Tic");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);

	}
}
