package seccion2variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C08EntradasTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		//String numeroStr = scanner.nextLine();
		int numeroDecimal = 0;
		try {
			numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr); - La clases Scanner se encarga de hacer el parse.
		} catch (InputMismatchException e) { //Exception es el tipo de excepción mas generica.
			System.out.println("Error, debe ingresar un número entero");
			main(args); //debemos volver al main para poder ejecutar el codigo desde el principio
			System.exit(0); //debemos salir del sistema antes de que se ejecute el resto del código
		}
		
		String resultadoDecimal = "numero decimal = "+numeroDecimal;
		String resultadoBinario = "numero binario de "+numeroDecimal+" = " +Integer.toBinaryString(numeroDecimal);
		String resultadoOctal = "numero octal de "+numeroDecimal+" = " +Integer.toOctalString(numeroDecimal);
		String resultadoHexadecimal = "numero hexadecimal de "+numeroDecimal+" = " +Integer.toHexString(numeroDecimal);
		
		String mensaje = resultadoDecimal;
		mensaje += "\n"+resultadoBinario;
		mensaje += "\n"+resultadoOctal;
		mensaje += "\n"+resultadoHexadecimal;
		
		System.out.println(mensaje);
	}
}



