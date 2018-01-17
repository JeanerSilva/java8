package br.com.colicon.teste;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Reflexao {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Contrato contrato = new Contrato();
		contrato.setContratada("Contratada");
		contrato.setContratoId(1); // o atributo tem que ser público
		//System.out.println("Start");
		//getAtributosNulos(contrato);
		//System.out.println("Campos não nulos: " + getAtributosNulos(contrato));
		getMetodos(contrato);
	}

	public static List<String> getAtributosNulos(Object o) {
		try {

			List<String> lista = new ArrayList<>();
			Class<?> c = o.getClass();

			for (Field f : c.getDeclaredFields()) {
				f.setAccessible(true);
				Object value = f.get(o);
				System.out.println(f.getName() + " " + value);
				if (value != null)
					lista.add(value.toString());
			}
			return lista;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void getMetodos(Object o) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		for (Method m : c.getMethods()) {
			// System.out.println(m);
			if (m.getName().contains("get") && m.getReturnType() == String.class) {
				String s = (String) m.invoke(o);
				System.out.println(s);
				//System.out.println(m.getName());
			}

		}
	}

}
