import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("casaaaaa");
		palavras.add("apartamento");
		palavras.add("sitio");

		palavras.sort(Comparator.comparing(s -> s.length()));
		Consumer<String> impressor = System.out::println;
		palavras.forEach(impressor);
		
		//palavras.forEach(s -> System.out.println(s));

	}
}

