package br.com.colicon.teste;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		//usando a class declarada no final
		
		System.out.println("\n\nClasse normal");
		Consumer<String> consumidor = new ConsumidorDeString();
		palavras.forEach(consumidor);
		
		System.out.println("\n\nClasse Anônima");
		//usado classe anônima
		Consumer<String> consumidorClasseAnonima = new Consumer<String>() {
		    public void accept(String s) {
		        System.out.println(s);
		    }
		};
		palavras.forEach(consumidorClasseAnonima);
		
		System.out.println("\n\nLâmbida com parâmetro");
		//usando lâmbida para não precisar de classe declarada ou anônima
		//formato usado quando tem parâmetro
		palavras.forEach((String s) -> {
		    System.out.println(s);
		});
		
		
		System.out.println("\n\nLâmbida sem parâmetro");
		//forma mais simplificada, pois a função não tem parâmetro
		palavras.forEach((s) -> {
		    System.out.println(s);
		});
		
		System.out.println("\n\nLâmbida sem parâmetro mais simples ainda");
		//forma mais simplificada, pois a função não tem parâmetro
		palavras.forEach(s -> System.out.println(s));

	}
}

class ConsumidorDeString implements Consumer<String> {
    public void accept(String s) {
        System.out.println(s);
    }
}