package ejercicio04;

import java.io.IOException;

public class Main04 {

	public static void main(String[] args) {
		try {
			String rutaClaseCalculo = "ejercicio04\\Ejercicio04.java";
			ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", ".", "Calculadora");
			processBuilder.directory(new java.io.File(rutaClaseCalculo).getParentFile());

			Process proceso = processBuilder.start();
			int resultado = proceso.waitFor();

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
