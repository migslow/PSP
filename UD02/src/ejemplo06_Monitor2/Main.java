package ejemplo06_Monitor2;

public class Main {

	public static void main(String[] args) {
		Bienvenida bienvenida = new Bienvenida();
		for (int i = 0; i < 15; i++) {
			new Alumno((i + 1) + "", bienvenida).start();
		}
		new Profesor("Miguel", bienvenida).start();
		

	}

}
