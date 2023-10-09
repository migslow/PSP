package ejemplo01_Runnable;

public class Hilo implements Runnable {

	public Hilo() {
		Thread t = new Thread(this, "Nuevo Thread");
		System.out.println("Creado hilo " + t.getName() + " con prioridad " + t.getPriority());
	}

	@Override
	public void run() {
		System.out.println("\n");
		System.out.println("Hola desde el hilo creado");
		System.out.println("El hilo creado ha finalizado");

	}

}
