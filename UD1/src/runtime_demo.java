import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class runtime_demo {

	public static void main(String[] args) throws InterruptedException, IOException {
		Runtime runtime = Runtime.getRuntime();
		System.out.println("Launching of Notepad Application");
		Process process = runtime.exec("Notepad.exe");
		System.out.println("Wait for 5 seconds");
		process.waitFor(5, TimeUnit.SECONDS);
		System.out.println("Exit of Notepad Application");
		process.destroy();

	}

}
