package ejemplo05_Monitor1;

public class Main {

	public static void main(String[] args) {
		Contador contador = new Contador();

		ContadorHilo contadorHilo1 = new ContadorHilo("Hilo1", contador);
		ContadorHilo contadorHilo2 = new ContadorHilo("Hilo2", contador);
		ContadorHilo contadorHilo3 = new ContadorHilo("Hilo3", contador);
		ContadorHilo contadorHilo4 = new ContadorHilo("Hilo4", contador);
		ContadorHilo contadorHilo5 = new ContadorHilo("Hilo5", contador);

		contadorHilo1.start();
		contadorHilo2.start();
		contadorHilo3.start();
		contadorHilo4.start();
		contadorHilo5.start();

		try {
			contadorHilo1.join();
			contadorHilo2.join();
			contadorHilo3.join();
			contadorHilo4.join();
			contadorHilo5.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("El programa a finalizado");

	}

}
