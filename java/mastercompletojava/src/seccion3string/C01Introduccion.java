package seccion3string;

public class C01Introduccion {

	public static void main(String[] args) {
		
		//Comparacion de cadenas de caracteres.
		String a = "A"; //Crear objeto con la literal
		String b = new String("A"); //Crear objeto de forma explicita (operador new)
		
		if (a == b) {
			//no pasa por aqui, porque a y b no son el mismo objeto aunque tengan el mismo valor
		} else {
			System.out.println("Son distintos, con == no comparamos el valor, sino la referencia del objeto.");
		}
		
		if(a.equals(b)) {
			System.out.println("Son iguales ya que comparamos el valor dentro de la variable que contiene el String");
		}

		
		//El objeto String no es un primitivo, es uno de los pocos tipos de objetos que podemos crear en la literal (sin el operador new)
		//Se opta por automatizar el proceso de la creación de un String
		
		
		String curso = "Programacion Java"; //forma 1
		String curso2 = new String("Programacion Java"); //forma2
		
		//Caso 1, comparacion de objetos
		boolean esIgual = curso == curso2; //metodo incorrecto
		System.out.println(esIgual);
		
		//Caso 2, comparacion de valores con metodo equals
		esIgual = curso.equals(curso2); //metodo correcto
		System.out.println(esIgual);
		
		String curso3 = "Programacion Java";
		
		//Caso 3, comparacion 2 objetos compartiendo la misma instancia.
		esIgual = curso == curso3; //comparando objetos, no solo los valores
		System.out.println(esIgual);
		//Lo que sucede aquí es que si hay 2 String creados por la literal y que contiene el mismo valor, aunque sea comparado con ==
		//el jdk automáticamente hará una referencia al objeto original y no creará un objeto nuevo, por eso el valor de la comparación es true
		//esto es para optimizar memoria
		
	}
}

//Metodos mas importantes de la clase String

/*
 * - int lenght(): número de caracteres
 * - boolean equals(String b): compara si ambas son iguales, por valor
 * - boolean equalsIgnoreCase(String): compara si ambas son iguales, independiente si son mayusculas y minúsculas
 * - int compareTo(String b): Compara contra la cadena del argumento, devolviendo:
 * 			- un valor negativo si la cadena es anterior a b
 * 			- cero (0) si la cadena es igual a b
 * 			- un valor positivo si la cadena es posterior a b
 * - String trim(): Crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final
 * - char charAt(int posicion): Extrae un caracter en la posicion indicada
 * - char[] toCharArray(): Convierte la cadena en un arreglo de caracteres
 * - String substring(int a, int b): Extrae la sub-cadena entre las posiciones a y b.
 * - String substring(int desde): Extrae la sub-cadena desde la posicion indicada.
 * - int indexOf(String cadena): Indican en que posición se encuentra el caracter (o cadena) indicado por primera vez, buscando desde el principio
 * - int lastIndexOf(String cadena): Indica en que posición se encuentra el caracter (o cadena) indicado por primera vez, buscando desde el final
 * - boolean startsWith(String prefijo) Dice si la cadena comienza con el prefijo indicado
 * - boolean endWith(String subfijo): Dice si la cadena termina con el sufijo indicado
 * - String[] split(String patron): Divide la cadena en varias subcadenas utilizando el patron indicado como separador.
 * 
*/
