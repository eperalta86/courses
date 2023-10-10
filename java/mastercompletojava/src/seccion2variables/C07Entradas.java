package seccion2variables;

import javax.swing.JOptionPane;

public class C07Entradas {

	public static void main(String[] args) {
		
		String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero: ");
		int numeroDecimal = 0;
		try {
			numeroDecimal = Integer.parseInt(numeroStr);
			
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
			main(args); //debemos volver al main para poder ejecutar el codigo desde el principio
			//return;
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
		
		JOptionPane.showMessageDialog(null, mensaje);

	}
}



