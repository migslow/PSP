import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class process_example03 {

	public static void main(String[] args) throws IOException {

		File f = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("java", "read_Example");
		pb.directory(f);
		Process p = pb.start();

		// Le pasamos una cadena de caracteres
		OutputStream os = p.getOutputStream();
		os.write("Hola Mundo".getBytes());
		os.flush();
		os.close();

		// Recibimos el resultado del proceso y lo imprimilos
		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != 1) {
			System.out.print((char) c);
		}

		is.close();

	}

}
