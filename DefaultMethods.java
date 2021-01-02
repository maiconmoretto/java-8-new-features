import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("casa");
		palavras.add("apartamento");
		palavras.add("sitio");

		Collections.sort(palavras);
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		palavras.forEach(consumidor);

	}
}

class ImprimeNaLinha implements Consumer<String> {
	public void accept(String s) {
		System.out.println(s);
	}
}
