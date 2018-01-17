package br.com.colicon.teste;

import java.awt.Window.Type;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;


public class Reflexao {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException {
		Contrato contrato = new Contrato();
		// contrato.setContratada("Contratada");
		// contrato.setContratoId(1); // o atributo tem que ser público
		// System.out.println("Start");
		// getAtributosNulos(contrato);
		// System.out.println("Campos não nulos: " + getAtributosNulos(contrato));
		// getMetodos(contrato);

		// Class<?> c = contrato.getClass();

		// Method setm = c.getMethod("setContratada", String.class);
		// setm.invoke(contrato, "teste");

		// Method m = c.getMethod("getContratada");
		// String s = (String) m.invoke(contrato);
		// System.out.println(s);

		// getMetodos(contrato);

		Class<?> c = contrato.getClass();
		int i = 0;
		for (Method m : c.getMethods()) {
			// if (m.getName().contains("setContratada")) {

			if (m.getName().contains("set")) 	{
				Parameter [] tipos = m.getParameters();
				for (i=0;i<tipos.length-1;i++) {}
				//System.out.println(tipos[i]);
				if (tipos[i] instanceof String) m.invoke(contrato,"teste");
			}
		}

		getMetodos(contrato);
		System.out.println(contrato);


		
		
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

	public static void getMetodos(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		for (Method m : c.getMethods()) {
			System.out.println(m.getParameterTypes());

		}
	}

	public static void getMetodos2(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		for (Method m : c.getMethods()) {
			// System.out.println(m);
			if (m.getName().contains("get") && m.getReturnType() == String.class) {
				String s = (String) m.invoke(o);
				System.out.println(s);
				// System.out.println(m.getName());
			}

		}
	}

	public static void setStrings(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> c = o.getClass();
		int i = 0;
		for (Method m : c.getMethods()) {
			if (m.getName().contains("set") && m.getReturnType() == String.class) {
				i++;
				m.invoke(o, "teste" + String.valueOf(i));
				// System.out.println(s);
				// System.out.println(m.getName());
			}

		}
	}

}
