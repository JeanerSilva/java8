package br.com.colicon.teste;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparador {
public static void main(String[] args) {
	List<String> palavras = new ArrayList<>();
	palavras.add("alura online");
	palavras.add("casa do c�digo");
	palavras.add("caelum");
	
	Comparator<String> comparador = new ComparadorDeStringPorTamanho();
	
	//usando a class
	Collections.sort(palavras, comparador);
	System.out.println("\n\nUsando class");
	System.out.println(palavras);

	//usando l�mbida
	palavras.sort((s1, s2) -> {
	    if (s1.length() < s2.length())
	        return -1;
	    if (s1.length() > s2.length())
	        return 1;
	    return 0;
	});
	System.out.println("\n\nUsando L�mbida 1");
	System.out.println(palavras);
	
	//usando l�mbida sucinto
	palavras.sort((s1, s2) -> {
	    return Integer.compare(s1.length(), s2.length());
	});
	System.out.println("\n\nUsando L�mbida 2");
	System.out.println(palavras);
	
	//usando l�mbida mais sucinto
	palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
	System.out.println("\n\nUsando L�mbida 3");
	System.out.println(palavras);
	
	//usando default em comparator
	System.out.println("\n\nUsando comparing");
	palavras.sort(Comparator.comparing(s -> s.length()));
	//as linha de cima e a de baixo s�o iguais	
	palavras.sort(Comparator.comparing(String::length)); //method reference
	
	/*
	Comparator<String> comparador = Comparator.comparing(s -> s.length());
	palavras.sort(comparador);
	
	ou
	
	Function<String, Integer> funcao = s -> s.length();
	Comparator<String> comparador = Comparator.comparing(funcao);
	palavras.sort(comparador);
	*/
	
	System.out.println("\n\nImprimir usando l�mbida");
	palavras.forEach(s -> System.out.println(s));
	
	System.out.println("\n\nImprimir usando method reference");
	palavras.forEach(System.out::println);
	
	/*
	Quando usar lambda e quando usar method reference? 
	Algumas vezes n�o � poss�vel usar method references. 
	Se voc� tiver, por exemplo, um lambda que dada uma String, 
	pega os 5 primeiros caracteres, far�amos s -> s.substring(0, 5). 
	Esse lambda n�o pode ser escrito como method reference! 
	Pois n�o � uma simples invoca��o de m�todos onde os 
	par�metros s�o os mesmos que os do lambda.
	*/
	
}
}


class ComparadorDeStringPorTamanho implements Comparator<String> {
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }
}




