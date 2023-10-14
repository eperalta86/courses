package seccion3string;

public class C06EjemploStringMetodos {

	public static void main(String[] args) {
		
		String nombre = "Esteban";
		
		System.out.println("nombre.length() = " + nombre.length());
		System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
		System.out.println("nombre.equals(\"Esteban\")= " + nombre.equals("Esteban"));
		System.out.println("nombre.equals(\"Esteban\")= " + nombre.equals("esteban"));
		System.out.println("nombre.equalsIgnoreCase(\"esteban\")= " + nombre.equalsIgnoreCase("Esteban"));
		System.out.println("nombre.compareTo(\"Esteban\")= " + nombre.compareTo("Esteban")); //compara los string lexicograficamente basada en la tabla unicode
		System.out.println("nombre.compareTo(\"Alejandro\")= " + nombre.compareTo("Alejandro")); //compara los string lexicograficamente basada en la tabla unicode
		System.out.println("nombre.charAt() = " +nombre.charAt(0));
		System.out.println("nombre.charAt() = " +nombre.charAt(1));
		System.out.println("nombre.charAt() = " +nombre.charAt(6));
		//System.out.println("nombre.charAt() = " +nombre.charAt(nombre.length()); //error IndexOutOfBounds
		System.out.println("nombre.charAt() = " +nombre.charAt(nombre.length()-1)); //obtenemos de forma dinámica el ultimo caracter
		System.out.println("nombre.substring(1) = " + nombre.substring(1)); //desde, inclusive
		System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4)); //2 argumentos desde y hasta, el hasta es no inclusive
		System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1)); //ultimo caracter de forma dinamica
		System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2)); //los dos ultimos caracter de forma dinamica
		
		String trabalenguas = "trabalenguas";
		System.out.println("trabalenguas.replace = " + trabalenguas.replace("a", "."));
		System.out.println("trabalenguas = " + trabalenguas);
		System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
		System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
		System.out.println("trabalenguas.lastIndexOf('lenguas') = " + trabalenguas.lastIndexOf("lenguas"));
		System.out.println("trabalenguas.lastIndexOf('z') = " + trabalenguas.lastIndexOf('z')); //retorna un -1, las comillas simples se aceptan porque si acepta caracteres
		System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("t")); //retorna un booleano, solo se pueden ocupar strings (comillas dobles)
		System.out.println("trabalenguas.startsWith('traba') = " + trabalenguas.startsWith("traba"));
		System.out.println("trabalenguas.endsWith('lenguas') = " + trabalenguas.endsWith("lenguas"));
		
		System.out.println("    trabalenguas   ".trim()); //quita espacios en la izquierda y derecha.

		//caso practico para buscar un caracter.
		if(trabalenguas.indexOf('z') < 0) {
			System.out.println("no existe la letra");
		}
	}
}

