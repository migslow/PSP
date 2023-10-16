package ejemplo05_Monitor1;

public class ContadorHilo extends Thread {

	Contador contador;

	public ContadorHilo(String nombre, Contador contador) {
		setName(nombre);
		this.contador = contador;
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				synchronized (contador) {
					int a = contador.getContador();
					sleep((long) (Math.random() * 10));
					contador.setContador(a + 1);
					sleep((long) (Math.random() * 10));
					System.out.println(getName() + " - contador: " + contador.getContador());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}

			System.out.println(getName() + " finalizado");
		}
	}
}
