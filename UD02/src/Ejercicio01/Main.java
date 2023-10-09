package Ejercicio01;

public class Main {

	public static void main(String[] args) {
		HiloTic hilo1 = new HiloTic();
		HiloTac hilo2 = new HiloTac();

		hilo1.start();
		
		hilo2.start();

	}

}
