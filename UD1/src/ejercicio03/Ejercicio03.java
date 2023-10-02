package ejercicio03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.ProcessBuilder.Redirect;
import java.util.Scanner;

public class Ejercicio03 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce la cadena de texto por teclado: ");
		String cadena = s.nextLine();

		System.out.println("===============MENU===============");
		System.out.println("1. Muestrame la cadena por terminal");
		System.out.println("2. Escribir en el fichero la cadena de texto 5 veces");
		System.out.println("3. Salir del programa");
		int opcion = s.nextInt();
		switch (opcion) {
		case 1:
			CadenaCincoVeces(cadena);
			break;
		case 2:

			guardarFichero(cadena);
			break;
		case 3:
			System.out.println("Has salido del programa");
			System.exit(-1);
			break;

		default:
			System.out.println(opcion < 1 && opcion > 3);
			System.out.println("No has introducido un numero entre 1 y 3, vuelve a inroducir el numero: ");
			opcion = s.nextInt();
			break;
		}

	}

	public static void guardarFichero(String cad) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("Fichero\\ejercicio03.txt"));
			for (int i = 0; i < 5; i++) {
				bw.write(cad);
				bw.newLine();
			}
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void CadenaCincoVeces(String cad) {
		for (int i = 0; i < 5; i++) {
			System.out.println(cad);
		}
	}

}
