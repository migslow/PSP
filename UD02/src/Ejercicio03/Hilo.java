package Ejercicio03;

public class Hilo implements Runnable {

	private int numero;

	public Hilo(int numero) {
		super();
		this.numero = numero;
	}

	@Override
	public void run() {
		if (numero < 5) {
			System.out.println("Hilo: " + numero + " iniciado.");
			Thread nuevoHilo = new Thread(new Hilo(numero + 1));
			nuevoHilo.start();

			try {
				nuevoHilo.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 1; i <= 10; i++) {
				System.out.println("Soy el hilo " + numero + " en la interacion " + i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("Hilo " + numero + " terminado");
		}
	}

}
