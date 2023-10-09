package Ejercicio01;

public class HiloTic extends Thread {

	public HiloTic() {
		super();
	}

	public void run() {
		do {
			System.out.println("Tic");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} while (true);

	}
}
