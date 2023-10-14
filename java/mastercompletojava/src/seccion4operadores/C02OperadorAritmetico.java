package seccion4operadores;

import javax.swing.JOptionPane;

public class C02OperadorAritmetico {

	public static void main(String[] args) {
		
		//se pueden definir mas de una variable del mismo tipo en una misma linea.
		int i = 5, j = 4;
		int suma = i + j;
		
		System.out.println("suma = " + suma);
		System.out.println("i + j = " + i + j); //esto concatenaria los numeros, no los sumaria, ya que java evalua de izquierda a derecha las expresiones, y hay un string que lo antecede.
		System.out.println(i + j + "i + j"); //esto si da 9
		System.out.println("i + j = " + (i + j)); //esto tambien da nueve, ya que los parentesis tienen prioridad
		
		int resta = i - j;
		System.out.println("resta = " + resta);
		//System.out.println("i - j = " + i - j); //esto da error, ya que java al anteceder un string, trata de tratar toda la expresion como string, y el signo menos (o cualquier otro signo que no sea +) no lo reconoce.
		System.out.println("i - j = " + (i - j)); //para el caso de los otros operadores que no sean +, siempre hay que usar parentesis al lado de un string.
		
		
		int multiplicacion = i * j;
		System.out.println("multiplicacion = " + multiplicacion);
		
		int division = i/j;
		float division2 = i/j;
		float division3 = (float)i/(float)j;
		
		System.out.println("division = " + division); //esto da 1, ya que el resultado real no es un entero y lo aproxima, por ende hay perdida de informacion.
		System.out.println("division2 = " + division2); //aqui hay otro problema, ya que tanto i como j son puntos flotantes, por lo que da 1.0
		System.out.println("division3 = " + division3); //resultado correcto
		
		int resto = i % j;  //de 4 a 5 cabe una sola vez, sobra 1 para llegar a 5
		int resto2 = 8 % 5; //de 5 a 8 cabe una sola vez, sobra 3 para llegar a 8.
		int resto3 = 4 % 2; //de 4 a 2, caben dos veces, y no sobra nada, por lo que el resto es 0
		
		System.out.println("resto = " + resto); //da 1
		System.out.println("resto2 = " + resto2); //da 3
		System.out.println("resto3 = " + resto3); //da 0
		
		//El resto se utiliza mucho para calcular numeros impares, si el resultado de un modulo es 0 es numero par, si da algo mayor a 0 entonces es impar.
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		if(numero % 2 == 0) {
			System.out.println("numero par = " + numero); 
		} else {
			System.out.println("numero impar = " + numero); 
		}
	}
}