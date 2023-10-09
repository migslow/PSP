package ejercicio05;

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("===================MENU===================");
		System.out.println("1. Calcular el area circulo ");
		System.out.println("2. Calcular el rectangurlo ");
		System.out.println("3. Calcular el triangulo ");
		System.out.println("4. Calcular el cuadrado ");
		System.out.println("5. Salir del menu");
		System.out.println("Introduce un numero entre 1 y 5");
		int opcion = s.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Introduce el radio: ");
			int radio = s.nextInt();
			break;
		case 2:
			System.out.println("Introduce la base: ");
			int baseRectangulo = s.nextInt();
			System.out.println("Introduce el area: ");
			int areaRectagulo = s.nextInt();
			int calculoRectangulo = baseRectangulo * areaRectagulo;
			System.out.println(calculoRectangulo);
			System.out.println("");
			break;
		case 3:
			System.out.println("Introduce la base: ");
			int base = s.nextInt();
			System.out.println("Introduce la altura: ");
			int altura = s.nextInt();
			int calculoTriangulo = base * altura / 2;
			System.out.println("El area del triangulo con una base de" + base + " cm y una altura de " + altura + " es "
					+ calculoTriangulo);
			break;
		case 4:
			System.out.println("Introduce el lado: ");
			int lado1 = s.nextInt();
			System.out.println("Introduce el lado: ");
			int lado2 = s.nextInt();
			int calculocuadrado = lado1 * lado1;
			System.out.println(calculocuadrado);
			break;
		case 5:
			System.out.println("Has salido del menu");
			System.exit(-1);
			break;
		default:
			System.out.println("No has introducido un numero entre 1 y 5. Vuelve a introducir un numero: ");
			opcion = s.nextInt();
			break;
		}

	}

}
