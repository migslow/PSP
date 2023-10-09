package ejemplo03_Yield;

public class Main {

	public static void main(String[] args) {

		Hilo hilo1 = new Hilo("hilo1");
		Hilo hilo2 = new Hilo("hilo2");

		hilo1.start();
		hilo2.start();
	}

}
