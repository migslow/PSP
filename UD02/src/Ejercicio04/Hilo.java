package Ejercicio04;

public class Hilo extends Thread {

	public Hilo(String nombre, int prioridad) {
		this.setName(nombre);
		this.setPriority(prioridad);
	}

	@Override
	public void run() {
		char[] caracteres = new char[20000];
		for (int i = 0; i < caracteres.length; i++) {
			caracteres[i] = 'a';
		}
		System.out.println("El vector " + getName() + " con prioridad " + getPriority() + " ha finalizado.");

	}

}
