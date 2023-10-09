package ejemplo02_Thread;

public class Main {

	public static void main(String[] args) {
		// Crea e inicia el hilo
		new Hilo().start();

		System.out.println("Hola desde el hilo principal");
		System.out.println("Acabado hilo principal");

	}

}
