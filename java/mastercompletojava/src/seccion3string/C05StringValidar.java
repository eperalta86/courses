package seccion3string;

public class C05StringValidar {

	public static void main(String[] args) {
		
		String curso = null;
		
		boolean esNulo = curso == null;
		
		System.out.println("esNulo = " + esNulo);
		//System.out.println(curso.toUpperCase()); //esto ocasiona un nullpointer
		
		System.out.println("Bienvenido al curso " + curso); //esto no ocasiona un nullpointer, ya que java es capaz de concatenar un nulo con el operador + (no asi con concat, ya que es un metodo)
		
		//Con esto, evitamos el nullpointer.
		if(esNulo == true) {
			curso = "Programacion Java";
			
			System.out.println(curso.toUpperCase());
		}
		
		curso = "";
		
		boolean esVacio = curso.length() == 0;
		boolean esVacio2 = curso.isEmpty();
		
		System.out.println(esVacio);
		System.out.println(esVacio2);
		
		if(!esVacio)
			System.out.println(curso.toUpperCase()); //NO SE EJECUTA
		
		curso = " ";
		
		boolean esVacio3 = curso.isEmpty();

		System.out.println(esVacio3); //Ya no es vacio porque es blanco
		
		if(esVacio3)
			System.out.println("No me ejecuto"); //Ya no es vacio porque es blanco
		
		boolean esBlanco = curso.isBlank(); //valida que no sea nulo, despues que no sea vacio y despues que no sea blanco
		
		if(esBlanco)
			System.out.println(esBlanco);
		
	}
}

