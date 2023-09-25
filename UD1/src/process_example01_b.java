import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class process_example01_b {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f = new File(".\\bin");
		ProcessBuilder pb = new ProcessBuilder("Java", "process_example01");
		pb.directory(f);

		System.out.println(pb.directory() + "");
		Process p;
		try {
			p = pb.start();
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1) {
				System.out.print((char) c);
			}
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
