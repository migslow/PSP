package ejercicio01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main01 {

	public static void main(String[] args) {
		try {
			// Ejecutamos un proceso que lanza el programa Ejercicio01b y le pasamos un
			// argumento
			File f = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicio01.Ejercicio01", args[0]);
			pb.directory(f);
			Process p = pb.start();

			//
			InputStream is = p.getInputStream();
			int c;
			System.out.println("Nombre: ");
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}

			// Coge el valor de la salida del programa Ejercicio01b
			int exitVal;
			exitVal = p.waitFor();
			System.out.print("Salida: " + exitVal);
			is.close();

			// Se coge el error si no encuentra el programa
			InputStream er = p.getErrorStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(er));
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.print(linea);
			}

			is.close();
			er.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
