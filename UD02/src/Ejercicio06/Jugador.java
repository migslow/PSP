package Ejercicio06;

public class Jugador extends Thread {

	private int idJugador;
	private Arbitro arbitro;

	public Jugador(int idJugador, Arbitro arbitro) {
		super();
		this.idJugador = idJugador;
		this.arbitro = arbitro;
	}

	public void run() {
		while (!arbitro.isFinJuego()) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (arbitro.getTurno() == idJugador) {
				int numeroAzar = (int) Math.random() * 10 + 1;
				arbitro.jugada(idJugador, numeroAzar);
			}
		}
	}

}
