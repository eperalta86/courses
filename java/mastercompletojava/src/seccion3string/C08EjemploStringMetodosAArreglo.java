package seccion3string;

public class C08EjemploStringMetodosAArreglo {

	public static void main(String[] args) {
		
		String trabalenguas = "trabalenguas";
		System.out.println("trabalenguas.length() = " + trabalenguas.length()); //este va con parentesis, ya que es un metodo de la clase String
		System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray()); //esto solo imprimira la referencia
		
		char[] arreglo = trabalenguas.toCharArray();
		
		int largo = arreglo.length; //length es un atributo en el int, por eso no lleva parentesis
		System.out.println("largo = " + largo);
		for(int i = 0;i < largo; i++) {
			System.out.println("arreglo = " + arreglo[i]);
		}
		
		//imprime la palabra
		for(int i = 0;i < largo; i++) {
			System.out.print(arreglo[i]);
		}
		
		System.out.println();
		System.out.println("\ntrabalenguas = " + trabalenguas.split("a")); //solo imprime la referencia
		
		String[] arreglo2 = trabalenguas.split("a");
		int l = arreglo2.length;
		for(int j=0; j<l; j++) {
			System.out.println(arreglo2[j]); //separa el array en varios strings segun el caracter dado
		}
		
		//obtener la extencion
		String archivo = "alguna_imagen.jpeg";
		String[] archivoArr = archivo.split("\\."); //el caracter punto es un caracter reservado para expresiones regulares, por lo que para utilizarlo hay que escaparlo con doble backslash
		//tambien se puede utilizar [.] como expresion regular para el punto, ya que el corchete significa un caracter especifico a evaluar.
		
		l = archivoArr.length;
		for(int j=0; j<l; j++) {
			System.out.println(archivoArr[j]); //separa el array en varios strings segun el caracter dado
		}
		
		//es l-1 porque el largo del array son 2 posiciones (archivo y jpeg), 
		//pero el indice de un array comienza por 0, asi que hay que restarle 1
		
		System.out.println("largo del indice de archivoArr = " + l);
		System.out.println("nombre del archivo = " + archivoArr[0]); //o [l-2] 
		System.out.println("extension = " + archivoArr[l-1]); 
		
	
	}
}

