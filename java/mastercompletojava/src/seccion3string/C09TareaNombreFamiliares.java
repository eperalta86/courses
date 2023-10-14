package seccion3string;

import java.util.Scanner;

public class C09TareaNombreFamiliares {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese los nombres");
		
		String nombre1 = scanner.next();
		String nombre2 = scanner.next();
		String nombre3 = scanner.next();
		
		System.out.println("nombre 1 = "+nombre1);
		System.out.println("nombre 2 = "+nombre2);
		System.out.println("nombre 3 = "+nombre3);		

		String nombre1nuevo = String.valueOf(nombre1.charAt(1)).toUpperCase()+"."+nombre1.substring(nombre1.length()-2);
		String nombre2nuevo = String.valueOf(nombre2.charAt(1)).toUpperCase()+"."+nombre2.substring(nombre2.length()-2);
		String nombre3nuevo = String.valueOf(nombre3.charAt(1)).toUpperCase()+"."+nombre3.substring(nombre3.length()-2);
		
		
		System.out.println(nombre1nuevo+"_"+nombre2nuevo+"_"+nombre3nuevo);
	
	}
}

