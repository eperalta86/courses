package seccion2variables;

public class C03PrimitivosCaracteres {
	

	public static void main(String[] args) {
		char caracter = 'A';
		char caracterUnicode = '\u0040';
		char caracterDecimal = 64;
		System.out.println("caracter = "+ caracter);
		System.out.println("caracterUnicode = "+ caracterUnicode);
		System.out.println("caracterDecimal = "+ caracterDecimal);
		System.out.println("decimal = caracter: " + (caracterUnicode == caracterDecimal));
		
		//tercera forma: simbolo
		
		char simbolo = '@';
		
		System.out.println("simbolo = "+ simbolo);
		
		//caracteres especiales
		
		//char espacio = '\u0020';
		char espacio = ' ';
		char retroceso = '\b'; //borra un caracter hacia atras
		char tabulador = '\t';
		char nuevaLinea = '\n';
		char retornoCarro = '\r';
		
		System.out.println("char corresponde en byte = "+ Character.BYTES);
		System.out.println("char corresponde en bites = "+ Character.SIZE);
		System.out.println("valor minimo char = "+ Character.MIN_VALUE);
		System.out.println("valor maximo char = "+ Character.MAX_VALUE);
		
	
		
		System.out.println("yo tabulo con \testo esta tabulado");
		System.lineSeparator(); //nueva linea y retorno de carro, variable de ambiente del jdk
		System.out.println("Hola es una nueva linea y"+System.lineSeparator()+"salto de carro");
		
		
	}

}
