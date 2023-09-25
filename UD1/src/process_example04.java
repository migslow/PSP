import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class process_example04 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder();
		Map entorno = pb.environment();
		System.out.println(entorno);

		// Comando
		pb = new ProcessBuilder("java", "LeerNombre", "Nombre1");
		List lista = pb.command();
		Iterator it = lista.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
