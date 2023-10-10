package seccion2variables;

import java.util.Scanner;

public class Tarea {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese nombre de la factura: ");
		String str = scanner.nextLine();
		
		double d1 = 0;
		double d2 = 0;
		
		System.out.println("Ingrese primer valor: ");
		d1 = scanner.nextDouble();
		System.out.println("Ingrese segundo valor: ");
		d2 = scanner.nextDouble();
		
		double precio = d1+d2;
		double precioConImpuesto = precio+(precio*0.19);
		System.out.println("Valor de factura "+str+" = monto bruto $"+precio+" - monto con impuesto = $ "+precioConImpuesto);

		
	}

}
