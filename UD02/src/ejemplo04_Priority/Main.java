package ejemplo04_Priority;

public class Main {

	public static void main(String[] args) {

		Hilo prioridadBaja = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);
		Hilo prioridadNormal = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);
		Hilo prioridadAlta = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);

		prioridadBaja.start();
		prioridadNormal.start();
		prioridadAlta.start();
	}

}
