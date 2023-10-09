package ejercicio05Clase;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		System.out.println("Elige una figura geometrica de la que quieras calcular su area:\n ");
		System.out.println("1. Circulo:\n");
		System.out.println("2. Triangulo:\n");
		System.out.println("3. Rectangulo:\n");
		String opcion = s.nextLine();

		ProcessBuilder pb = null;
		Process p = null;
		File f = new File(".\\bin");

		if (opcion.equals("1")) { // Circulo
			System.out.println("Introduce el radio:");
			String radio = s.nextLine();
			if (isNumeric(radio)) {
				// Solo se le puede meter String, con INT peta
				pb = new ProcessBuilder("java", "ejercicio05Clase.CalculadoraDeAreas", opcion, radio);
				pb.directory(f);
				// Redirige el error
				File ferror = new File("errorCalculadora.txt");
				pb.redirectError(ferror);
				// Inicia el proceso
				p = pb.start();
			} else {
				System.out.println("No se ha introducido un numero");
				System.exit(-1);
			}
		} else if (opcion.equals("2") || opcion.equals("3")) { // Triangulo o rectangulo
			System.out.println("Introduce la base: ");
			String base = s.nextLine();
			System.out.println("Introduce la altura: ");
			String altura = s.nextLine();
			if (isNumeric(base) && isNumeric(altura)) {
				// Solo se le puede meter String, con INT peta
				pb = new ProcessBuilder("java", "ejercicio05Clase.CalculadoraDeAreas", opcion, base, altura);
				pb.directory(f);
				// Redirige el error
				File ferror = new File("errorCalculadora.txt");
				pb.redirectError(ferror);
				// Inicia el proceso
				p = pb.start();
			} else {
				System.out.println("No se ha introducido un numero");
				System.exit(-1);
			}
		} else {
			System.out.println("No se ha elegido ninguna opcion valida");
			System.exit(-1);
		}

		// Lee la salida de la calculadora de areas
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();
	}

	public static boolean isNumeric(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}
}
