package seccion3string;

public class C02Concatenacion {

	public static void main(String[] args) {
		
		String curso = "Programacion Java"; 
		String profesor = "Alan Brito";
		
		
		String detalle = curso + " con el profesor " + profesor;
		
		int numeroA = 10;
		int numeroB = 5;
		
		//Las expresiones de evaluacion de izquierda a derecha, a exception de los parentesis que tienen mayor preferencia
		System.out.println(detalle + numeroA + numeroB); // concatena todo como cadena debio a la precedencia de tipo, si un String está a la izquierda asumira que todo es un string
		System.out.println(numeroA + numeroB + detalle);
		System.out.println(detalle + (numeroA + numeroB));
		
		String detalle2 = curso.concat(profesor); //forma 2, con metodo concat
		System.out.println(detalle2);
		
		String detalle3 = curso.concat(" con ").concat(profesor); //forma 3, concat anidado
		System.out.println(detalle3);
		
		//Nota: Los String son inmutable, por lo que concat no cambia el valor de curso, sino que devuelve una nueva instancia de String con el valor concatenado
		//Método contact es mas eficiente que el signo + al concatenar, ya que el signo +, ya que java crea una instancia de la clase StringBuilder por cada vez que utilizamos el signo + para concatenar
	}
}

