package ejercicio03;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main03 {

	static Scanner s1 = new Scanner(System.in);
	static Scanner s2 = new Scanner(System.in);

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Elige una de las siguientes opciones: ");
		System.out.println("1. Introduce una cadena de texto y que se visualice cinco veces");
		System.out.println("2. Introduce una cadena de texto y que se guarde 5 veces en un fichero");

		int opcion = s1.nextInt();

		System.out.println("Introduce la cadena de texto: ");
		String cadena = s2.nextLine();

		File f = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "ejercicio03.Ejercicio03_v2", cadena);
		pb.directory();

		// Escribe la cadena de texto introducida en salida.txt
		if (opcion == 2) {
			File fout = new File("salida.txt");
			pb.redirectOutput(fout);
		}

		Process p = pb.start();

		// Escribe la cadena de texto introducida por terminal
		if (opcion == 1) {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1) {
				System.out.println((char) c);
			}
			// int exitVal = p.waitFor();
			is.close();
		}

		// Lee si la clase CadenaCincoVeces da error y lo imprime
		InputStream er = p.getErrorStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(er));
		String linea = null;
		while ((linea = br.readLine()) != null) {
			System.out.println("ERROR: " + linea);
		}
		er.close();
		br.close();

	}

}
