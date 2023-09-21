
public class process_demo {
	public static void main(String[] args) {
		try {
			System.out.println("Creating process");

			ProcessBuilder builder = new ProcessBuilder("notepad.exe");
			Process pro = builder.start();

			System.out.println("Waiting");
			Thread.sleep(10000);

			pro.destroyForcibly();
			System.out.println("Process destroyed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
