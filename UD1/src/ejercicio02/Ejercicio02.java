package ejercicio02;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// No se han enviado argumentos
		if(args.length == 0) {
			System.exit(1);
		} else if (args.length > 1) {
			System.exit(2);
		}else if (!isNumeric(args[0])) {
			System.exit(3);
		}else if (Integer.parseInt(args[0]) < 0) {
			System.exit(4);
		}else if (Integer.parseInt(args[0]) > 0) {
			System.exit(4);
		}else if (Integer.parseInt(args[0]) == 0) {
			System.exit(5);
		} else {
			
		}

	}
	
	public static boolean isNumeric(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
