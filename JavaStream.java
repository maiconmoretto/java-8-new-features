import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.security.auth.x500.X500Principal;

class Curso {

	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAlunos() {
		return alunos;
	}

	public void setAlunos(int alunos) {
		this.alunos = alunos;
	}

}

public class JavaStream {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("PHP", 10));
		cursos.add(new Curso("JAVA", 100));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		System.out.println("\n para cada curso com quantidade igual ou maior de 10 alunos\r\n"
				+ "		mostra o numero de alunos ------"); 
		
		//para cada curso com quantidade igual ou maior de 10 alunos
		//mostra o numero de alunos
		cursos.stream()
			.filter(c -> c.getAlunos() >= 10)
			.map(c -> c.getAlunos())
			.forEach(total -> System.out.println(total));
		
		System.out.println("\n conta total de alunos com quantidade igual ou maior de 10 alunos ------"); 
		//conta total de alunos com quantidade igual ou maior de 10 alunos
		int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 10)
				.mapToInt(c -> c.getAlunos())
				//.forEach(total -> System.out.println(total));
				.sum();
		
		System.out.println("total = " + sum);
		
		

		System.out.println("\nlista de numeros  de 1 a 10 com skid de 5 ------"); 
		//stream inteiro com skip
		IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x -> System.out.println(x));
		
		System.out.println("\nlista de nomes igual a Maria ------"); 
		Stream.of("Jose", "Maria", "Alberto")
		.filter(nome -> nome.equals("Maria"))
		.sorted()
		.forEach(System.out::println);
	
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Jose");
		nomes.add("Alberto");
		nomes.add("Maria");		
		
		nomes.stream()
		.filter(nome -> nome.startsWith("A"))
		.sorted()
		.forEach(System.out::println);		
			
		String[] listaNomes = {"Joao", "Maria", "Alberto"};		
		
		System.out.println("\nlista de nomes que começam por A ------");  
		Arrays.stream(listaNomes) 
		.filter(nome -> nome.startsWith("A")) .sorted()
		.forEach(System.out::println);		 
		
		   //utiliza o stream para gerar uma nova lista com o filtro desejado e  ordenado
		List<String> novosNomes = nomes.stream()
			   .filter(n -> n.length() > 4)
			   .sorted()
			   .collect(Collectors.toList());
	   
	   System.out.println("\nnovos nomes ordenados que tenham tamanho maior que 4 ------");
	   novosNomes.stream()
	   .forEach(System.out::println);

	}
}
