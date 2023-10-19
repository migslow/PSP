package Ejercicio05;

public class Abecedario {

	private char letra = 'a';

	public synchronized void imprimirAbecedario() {
		char siguienteLetra = letra;
		letra++;
		System.out.print(siguienteLetra);
	}

}
