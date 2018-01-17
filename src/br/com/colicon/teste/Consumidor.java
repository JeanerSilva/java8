package br.com.colicon.teste;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");
		
		//usando a class declarada no final
		
		System.out.println("\n\nClasse normal");
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		
		System.out.println("\n\nClasse An�nima");
		//usado classe an�nima
		Consumer<String> consumidorClasseAnonima = new Consumer<String>() {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		};
		palavras.forEach(consumidorClasseAnonima);
		
		System.out.println("\n\nL�mbida com par�metro");
		//usando l�mbida para n�o precisar de classe declarada ou an�nima
		//formato usado quando tem par�metro
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		
		System.out.println("\n\nL�mbida sem par�metro");
		//forma mais simplificada, pois a fun��o n�o tem par�metro
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		System.out.println("\n\nL�mbida sem par�metro mais simples ainda");
		//forma mais simplificada, pois a fun��o n�o tem par�metro
		palavras.forEach(s -> System.out.println(s));

	}
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}