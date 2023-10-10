package seccion2variables;

public class C10ConversionTiposPrimitivosAString {

	public static void main(String[] args) {
		
		int numeroInt = 100;
		
		System.out.println("numeroInt = "+numeroInt);
		
		String otroNumeroInt = Integer.toString(numeroInt);
		
		System.out.println("otroNumeroInt = "+ otroNumeroInt);
		
		String otroNumeroString = String.valueOf(numeroInt); 
		//Sobrecarga de método: mismo metodo con distintos argumentos
		System.out.println("otroNumeroString = "+ otroNumeroString);
		
		otroNumeroString = String.valueOf(numeroInt+10); //no lo concatena, lo suma porque primero suma int+int, despues lo convierte a string
		//otroNumeroString = String.valueOf(otroNumeroString+10); Si hacemos esto, lo concatena.
		
		System.out.println("otroNumeroString = "+ otroNumeroString);
		
		double realDouble = 1.23456;
		String realStr = Double.toString(realDouble);
		System.out.println("realStr = "+ realStr);
		
		realStr = String.valueOf(1.23456f); //convertir un float literal en string
		//realStr = String.valueOf(1.23456e2f); //tambien se puede hacer con su notacion cientifica
		System.out.println("realStr = "+ realStr); 
		
		
				
	}
}



