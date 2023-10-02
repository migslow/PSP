package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el primer numero: ");
		double n1 = s.nextInt();
		System.out.println("Introduce el segundo numero: ");
		double n2 = s.nextInt();

		System.out.println("==================================");
		System.out.println("===============MENU===============");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		System.out.println("5. Salir");
		int opcion = s.nextInt();
		switch (opcion) {
		case 1:
			double suma = n1 + n2;
			String resultado1 = n1 + " + " + n2 + " = " + suma;
			System.out.println(resultado1);
			break;
		case 2:
			double resta = n1 - n2;
			String resultado2 = n1 + " - " + n2 + " = " + resta;
			System.out.println(resultado2);
			break;
		case 3:
			double multiplicacion = n1 * n2;
			String resultado3 = n1 + " * " + n2 + " = " + multiplicacion;
			System.out.println(resultado3);
			break;
		case 4:
			if (n1 == 0 && n2 == 0) {
				System.out.println("No se puede dividir entre 0");
				System.out.println("Vuelve a introducir los numeros: ");
				n1 = s.nextDouble();
				n2 = s.nextDouble();
			}
			double division = n1 / n2;
			String resultado4 = n1 + " / " + n2 + " = " + division;
			System.out.println(resultado4);
			break;
		case 5:
			System.out.println("Has salido del programa");
			System.exit(-1);
			break;
		default:
			if (opcion < 1 && opcion > 5) {
				System.out.println("No has introducido un numero entre 1 y 5");
			}
			break;
		}

	}

}
