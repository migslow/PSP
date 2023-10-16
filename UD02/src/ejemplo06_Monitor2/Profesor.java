package ejemplo06_Monitor2;

public class Profesor extends Thread {
	private String nombre;
	private Bienvenida bienvenida;

	public Profesor(String nombre, Bienvenida bienvenida) {
		super();
		this.nombre = nombre;
		this.bienvenida = bienvenida;
	}

	public void run() {
		System.out.println("El profesor a llegado");
		try {
			sleep(1000);
			bienvenida.llegadaProfesor(nombre);
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}

}
