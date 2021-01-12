import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		palavras.add("casaaaaa");
		palavras.add("apartamento");
		palavras.add("sitio");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		Consumer<String> impressor = s -> System.out.println(s);
		palavras.forEach(impressor);
		
		//palavras.forEach(s -> System.out.println(s));

	}
}

