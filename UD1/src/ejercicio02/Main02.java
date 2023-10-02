package ejercicio02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main02 {

	public static void main(String[] args) {
		try {
			File f = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicio02.Ejercicio02", args[0]);
			pb.directory(f);
			Process p = pb.start();
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			int aux;
			while ((aux = br.read()) != -1) {
				System.out.print((char) aux);
			}
			br.close();
			is.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
