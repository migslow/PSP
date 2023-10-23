package Ejercicio06;

public class Arbitro {

	private int numeroJugador;
	private int turno;
	private int numAdivinar;
	private boolean finJuego = false;

	public Arbitro(int numeroJugador, int turno, int numAdivinar, boolean finJuego) {
		super();
		this.numeroJugador = numeroJugador;
		this.turno = 1;
		this.numAdivinar = (int) Math.random() * 10 + 1;
		this.finJuego = finJuego;
		System.out.println("Numero a adivinar: " + numAdivinar);
	}

	public int getTurno() {
		return turno;
	}

	public boolean isFinJuego() {
		return finJuego;
	}

	public synchronized void jugada(int idJugador, int numeroJugador) {
		System.out.println("Jugador" + idJugador + " dice: " + numeroJugador);
		if (numeroJugador == numAdivinar) {
			System.out.println("El jugador " + idJugador + " gana el juego");
			finJuego = true;
		} else {
			if (turno == numeroJugador) {
				turno = 1;
			} else {
				turno++;
			}
		}
		System.out.println("Le toca al jugador " + turno);
	}

}
