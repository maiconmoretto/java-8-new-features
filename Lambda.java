import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("casa");
		palavras.add("apartamento");
		palavras.add("sitio");

		Collections.sort(palavras);
		
		palavras.forEach(s -> System.out.println(s));

	}
}

