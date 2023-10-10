package seccion2variables;


public class C01Main {

	public static void main(String[] args) {
		
		//ENTEROS
		byte mibyte = 127; //maximo valor de un entero de 8 bits
		int miint = 2147483647; //maximo valor de un entero de 16 bits
		short mishort = 32767; //maximo valor de un entero de 32 bits 
		long milong = 999999999999999999L;
		
		//FLOTANTE
		
		float mifloat = 5.5f; // Punto flotante de precision simple de 32 bits
		double midouble = 5.5; // Punto flotante de precision doble de 64 bits
		
		//float es menos preciso pero maneja la memoria de forma mas eficiente, ademas no puede guardar decimales. Solo usar float si el manejo de memoria es cr�tico.
		
		System.out.println(mifloat);
	}
}


// byte es un tipo de datos numerico de 8 bits
// short es un tipo de datos numerico de 16 bits
// int es un tipo de dato numerico de 32 bits
// long es un tipo de dato de 64 bits???


// byte  (numeric 1 byte)
// short (number, 2 bytes)
// int   (number, 4 bytes)

