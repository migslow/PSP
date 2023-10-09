package ejercicio05;

import java.io.File;
import java.io.IOException;

public class CalculadoraDeAreas {
	public static void main(String[] args) {
		try {
			/*
			String rutaClaseCalculo = "ejercicio05\\Main.java";
			ProcessBuilder processBuilder = new ProcessBuilder("java", "", ".", "Calculadora");
			processBuilder.directory(new java.io.File(rutaClaseCalculo).getParentFile());
	*/
			File f = new File(".\\bin");
			ProcessBuilder pb = new ProcessBuilder("java", "ejercicio05.Main");
			pb.directory();

			Process p = pb.start();
			int resultado = p.waitFor();

			if (resultado == 0) {
				System.out.println("El proceso de cálculo ha finalizado exitosamente.");
			} else {
				System.out.println("El proceso de cálculo ha finalizado con errores.");
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
}
