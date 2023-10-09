package ejercicio05Clase;

public class CalculadoraDeAreas {
	public static void main(String[] args) {
		if (args[0].equals("1")) { // Circulo
			System.out.print(
					"El area del ciruclo es: " + (3.1416 * Double.parseDouble(args[1]) * Double.parseDouble(args[1])));
		} else if (args[1].equals("2")) { // Triangulo
			System.out.print(
					"El area del tringulo es: " + (Double.parseDouble(args[1]) * Double.parseDouble(args[2]) / 2));
		} else { // Rectangulo
			System.out
					.print("El area del rectangulo es: " + (Double.parseDouble(args[1]) * Double.parseDouble(args[2])));
		}
	}
}
