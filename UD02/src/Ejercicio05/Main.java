package Ejercicio05;

public class Main {

	public static void main(String[] args) {
		Abecedario abecedario = new Abecedario();
		int totalLetras = 26;
		int letrasPartidos = totalLetras / 2;
		
		AbecedarioHilo hilo1 = new AbecedarioHilo(abecedario, letrasPartidos);
		AbecedarioHilo hilo2 = new AbecedarioHilo(abecedario, letrasPartidos);
		
		hilo1.start();
		hilo2.start();

	}

}
