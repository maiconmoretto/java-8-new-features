import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;


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


public class Stream {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("PHP", 10));
		cursos.add(new Curso("JAVA", 100));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.forEach(c-> System.out.println(c.getNome()));

	}
}

