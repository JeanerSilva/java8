package br.com.colicon.teste;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));	
	
		//ordena pelo número de alunos
		cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		//ou
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//replica o método toString(), que imprime apenas o endereço
		//cursos.forEach(System.out::println);
		
		//em razão disso, deve-se usar o lambda para imprimir o getnome ou override o toString()
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//o filter não altera a colletion original a variável cursos se mantém completa
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100);
		cursos.forEach(c -> System.out.println(c.getNome()));
		
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.forEach(c -> System.out.println( c.getNome()));
		
		//imprimir o número de alunos usando lâmbida
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(c -> c.getAlunos())
		.forEach(total -> System.out.println(total));
		
		//imprimir o número de alunos usando method reference
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.map(Curso::getAlunos)
		.forEach(System.out::println);
		
		//imprimir o número de alunos usando method reference e IntStrean
		IntStream streamInt = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos);
		System.out.println(streamInt);
		
		//soma todos os alunos
		int soma = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.mapToInt(Curso::getAlunos)
		.sum();
		System.out.println(soma);
		
		//pega qualquer curso acima de 100 alunos
		
		Optional <Curso> optcionalCurso = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny();
	
		//Curso curso = optcionalCurso.get(); //se for null dá exception
		Curso curso = optcionalCurso.orElse(null);
		System.out.println(curso.getNome());
		
		optcionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println("if: " + c.getNome()));
		
		//se quiser guardar o resultado do filtro
		List<Curso> resultado = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toList());
		System.out.println(resultado);
		
		//guardando o strem a um map
		Map<String, Integer> resultadoMap = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()));
		System.out.println(resultadoMap);
		
		//filtrando MAP e já executando sem guardar
		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toMap(
				c -> c.getNome(),
				c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println("Curso: " + nome + ". Alunos:" + alunos));
		
		//Stream<Curso>  streamDeCurso = cursos.stream();
		//Stream<Curso> streamDeCurso2 = cursos.stream().filter(c -> c.getAlunos() > 100);
	
	}
	
   
}

class Curso {
	 private String nome;
	    private int alunos;

	    public Curso (String nome, int alunos) {
	        this.nome = nome;
	        this.alunos = alunos;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getAlunos() {
	        return alunos;
	    }
}