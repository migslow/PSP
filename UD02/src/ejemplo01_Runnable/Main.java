package ejemplo01_Runnable;

public class Main {

	public static void main(String[] args) {

		Hilo hilo = new Hilo();
		hilo.run();

		System.out.println("\n");
		System.out.println("Hola desde el hilo principal");
		System.out.println("El Hilo principal ha finalizado");
	}

}
