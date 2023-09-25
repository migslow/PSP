import java.io.File;
import java.io.IOException;

public class process_example06 {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("CMD");
		
		File fBat = new File("Fichero//fichero.bat");
		File fout = new File("Fichero//salida2.bat");
		File ferror = new File("Fichero//error2.bat");

		pb.redirectOutput(fout);
		pb.redirectInput(fBat);
		pb.redirectError(ferror);
		pb.start();
	}

}
