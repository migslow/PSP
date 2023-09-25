import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class read_Example {

	public static void main(String[] args) throws IOException {
		// Lee la entrada
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String linea;

		System.out.println("Introduce una cadena: ");
		linea = br.readLine();
		System.out.println("Cadena escrita: " + linea);
		br.close();
		isr.close();
	}

}
