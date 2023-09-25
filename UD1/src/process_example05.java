import java.io.File;
import java.io.IOException;

public class process_example05 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DIR");

		File fout = new File("Fichero//salida.txt");
		File ferror = new File("Fichero//error.txt");

		pb.redirectOutput(fout);
		pb.redirectError(ferror);
		pb.start();

	}

}
