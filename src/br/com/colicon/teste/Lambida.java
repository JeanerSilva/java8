package br.com.colicon.teste;
import java.util.ArrayList;
import java.util.List;

public class Lambida {
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.forEach(s -> System.out.println(s));
		
		/*
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		Pronto. Em vez de usarmos classes anônimas, utilizamos o lambda para escrever códigos 
		simples e sucintos nesses casos. Uma interface que possui apenas um método abstrato 
		é agora conhecida como interface funcional e pode ser utilizada dessa forma.
		
		*/
	}
}
