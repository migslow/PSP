package Ejercicio04;

import ejemplo04_Priority.Hilo;

public class Main {

	public static void main(String[] args) {

		Hilo hilo1 = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);
		Hilo hilo2 = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);
		Hilo hilo3 = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);
		Hilo hilo4 = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);
		Hilo hilo5 = new Hilo("prioridadBaja", Thread.MIN_PRIORITY);

		Hilo hilo6 = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);
		Hilo hilo7 = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);
		Hilo hilo8 = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);
		Hilo hilo9 = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);
		Hilo hilo10 = new Hilo("prioridadNormal", Thread.NORM_PRIORITY);

		Hilo hilo11 = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);
		Hilo hilo12 = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);
		Hilo hilo13 = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);
		Hilo hilo14 = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);
		Hilo hilo15 = new Hilo("prioridadAlta", Thread.MAX_PRIORITY);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
		hilo6.start();
		hilo7.start();
		hilo8.start();
		hilo9.start();
		hilo10.start();
		hilo11.start();
		hilo12.start();
		hilo13.start();
		hilo14.start();
		hilo15.start();

	}

}
