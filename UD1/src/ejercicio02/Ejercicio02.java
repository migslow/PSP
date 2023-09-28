package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		try {
			int n = 0;
			if (args.length == 1) {
				if (n > Integer.parseInt(args[0])) {
					System.out.println("El argumento es un numero mayor que 0");
				} else if (n < Integer.parseInt(args[0])) {
					System.out.println("El argumento es un numero mayor que 0");
				} else if (n == Integer.parseInt(args[0])) {
					System.out.println("El argumento es un 0");
				}
			} else if (args.length >= 2) {
				System.out.println("Se han pasado 2 o mas argumentos");
			} else {
				System.out.println("No se han pasado argumentos");
				System.exit(-1);
			}
		} catch (NumberFormatException e) {
			System.out.println("El argumento es una cadena de texto");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
