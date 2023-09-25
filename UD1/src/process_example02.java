import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class process_example02 {

	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("CMD", "/C", "ipconfig").start();

		// Coge el resultado del comando bit a bit
		InputStream is = p.getInputStream();

		// Lee caracter a caracter
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}

		// Lee si el programa devuelve un error
		InputStream er = p.getErrorStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(er));
		String linea;
		while ((linea = br.readLine()) != null) {
			System.out.print(linea);
		}
		is.close();
		er.close();
		br.close();
	}

}
