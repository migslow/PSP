package ejemplo06_Monitor2;

public class Alumno extends Thread {
	private String nombre;
	private Bienvenida bienvenida;

	public Alumno(String nombre, Bienvenida bienvenida) {
		super();
		this.nombre = nombre;
		this.bienvenida = bienvenida;
	}

	public void run() {
		System.out.println("El alumno " + nombre + " a llegado");
		try {
			sleep(1000);
			bienvenida.saludoAlumno(nombre);
		} catch (InterruptedException e) {
			e.printStackTrace();
			e.getMessage();
		}
	}
}
