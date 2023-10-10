package seccion2variables;

public class C11ConversionTiposPrimitivosAPrimitivos {

	public static void main(String[] args) {
	
		int i = 10000;
		//short s = i; no se puede asignar un tipo entero a un tipo short, ya que short es mas pequeño que integer y puede haber perdida de informacion
		
		//i = 32767; //esto va a funcionar, el numero maximo de un short es 32767 inclusive.
		//i = 32768; //esto no va a funcionar, compilará pero quedará completamente ambiguo, da como resultado -32768 en negativo.
		short s = (short)i; //si el integer tiene una información que cabe en el short, se puede forzar el casteo.
		
		long l = i; //si me permite castear directamente un integer a un long, ya que long es un tipo de dato mas grande que integer
		
		System.out.println("s = "+ s); 
		System.out.println("l = "+l);
		System.out.println(Short.MAX_VALUE);
		char b = (char)i;
		System.out.println("b = " + b); //imprime un caracter unicode si lo convertimos a char, cada numero está asociado a un caracter unicode
		float f = (float)i;
		System.out.println("f = "+ f);
		
				
	}
}



