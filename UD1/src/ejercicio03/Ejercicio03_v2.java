package ejercicio03;

import java.io.File;
import java.util.Scanner;

public class Ejercicio03_v2 {

	public static void main(String[] args) {
		if (args[0].length() > 0) {
			for (int i = 0; i < 5; i++) {
				System.out.println(args[0]);
			}
			System.exit(0);
		} else {
			System.exit(-1);
		}

	}

}
