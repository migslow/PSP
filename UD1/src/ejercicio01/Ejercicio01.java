package ejercicio01;

public class Ejercicio01 {

	public static void main(String[] args) {
		try {
			// Comprueba si hay argumentos. Si hay, lo escribe y devuelve 0.
			if (args.length > 0) {
				System.out.println(args[0]);
				System.exit(0);
			} else { // Si no hay argumentos, devuelve -1
				System.exit(-1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
