package ejemplo06_Monitor2;

public class Bienvenida {

	boolean claseComenzada;

	public Bienvenida() {
		claseComenzada = false;
	}

	public synchronized void llegadaProfesor(String nombre) {
		System.out.println("Buenos dias a todos, soy el profesor " + nombre);
		claseComenzada = true;
		notifyAll();
	}

	public synchronized void saludoAlumno() {
		try {
			while (!claseComenzada) {
				wait();
			}
			System.out.println("Buenos dias.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
