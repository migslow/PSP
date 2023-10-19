package Ejercicio05;

public class AbecedarioHilo extends Thread {
	private Abecedario abecedario;
	private int totalLetras;

	public AbecedarioHilo(Abecedario abecedario, int totalLetras) {
		super();
		this.abecedario = abecedario;
		this.totalLetras = totalLetras;
	}

	public void run() {
		for (int i = 0; i < totalLetras; i++) {
			abecedario.imprimirAbecedario();
		}
	}

}
