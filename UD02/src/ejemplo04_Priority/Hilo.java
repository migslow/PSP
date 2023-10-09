package ejemplo04_Priority;

public class Hilo extends Thread {

	public Hilo(String nombre, int prioridad) {
		this.setName(nombre);
		this.setPriority(prioridad);
	}

	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("Hilo " + getName() + " " + getPriority());
		}
		System.out.println("Hilo " + getName() + " " + getPriority() + " finalizado");
	}
}
