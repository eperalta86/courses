package seccion2variables;

public class C06SistemasNumericos {

	public static void main(String[] args) {
		
		int numeroDecimal = 500;
		
		//BINARIO
		System.out.println("numeroDecimal = "+numeroDecimal);
		System.out.println("numero binario de "+numeroDecimal+" = " +Integer.toBinaryString(numeroDecimal));
		
		int numeroBinario = 0b111110100; //0b hace que la jvm interprete que es un numero binario, una combinacion de 0s y 1s.
		System.out.println("numeroBinario = "+numeroBinario);
		
		//OCTAL
		System.out.println("numero octal de "+numeroDecimal+" = " +Integer.toOctalString(numeroDecimal));
		int numeroOctal = 0764; //con 0 hace que la jvm interprete que es un numero octal
		System.out.println("numeroOctal = "+numeroOctal);
		
		//HEXADECIMAL
		System.out.println("numero hexadecimal de "+numeroDecimal+" = " +Integer.toHexString(numeroDecimal));
		int numeroHexadecimal = 0x1f4; //con 0 hace que la jvm interprete que es un numero octal
		System.out.println("numeroHexadecimal = "+numeroHexadecimal);
		
		//HEXADECIMAL CORRESPONDIENTE AL NUMERO 11
		int once = 0xB;
		System.out.println("numeroHexadecimal 11 = "+once);
		
		

	}

}
