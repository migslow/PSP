import java.io.IOException;
import java.io.InputStream;

public class process_example01 {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Crea un proceso que abre la consola y ejecuta el comando DIR
		Process proceso = new ProcessBuilder("CMD", "/C", "DIR").start();

		// Coge la salida del proceso
		InputStream is = proceso.getInputStream();

		//
		int c;

		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}

		// Cerramos el is
		is.close();

		int exitVal = proceso.waitFor();
		System.out.println("Valor de retorno: " + exitVal);
	}

}
