package seccion4operadores;

public class C01Introduccion {

	public static void main(String[] args) {
		
		int a = 1;
		int b = ++a; //a vale 2 porque lo incrementó antes.
		
		System.out.println(a);
		System.out.println(b);
		
	}
}

//Operadores

//Descripcion				Simbolo			Expresion Ejemplo		Resultado
//
//Mutiplicacion 			*				2*7						14
//Division 					/				6/3						2
//Modulo o resto 			%				5%2						1
//Suma 						+				5+3						8
//Resta 					-				5-3						2
//Incremento 				++				++2						3
//Decremento 				--				--1						1
//Menos Unario 				-				-(4+2)					-6

//Operadores Combinados
//Operadores combinados o compuestos: -=, +=, /=.*= etc.

//Ej: a+=5 es equivalente a: a=a+5
//int a = 3;
//a+=5; a vale 8

//Operador Incremento Decremento

//++a Pre-incremento, incrementa en 1 y luego devuelve a
//a++ Post-incremento, Devueve a, y luego incrementa en uno
//--a Pre-decremento, decrementa en uno, y luego devuelve a
//a-- Post-decremento, devuelve a y luego decrementa en uno

//Ej:
//	
//int a = 1;
//En este primer caso, a valdra 2 y b 2 tambien
//int b = ++a;
//a = 1;
//ahora a sigue valiendo 2, pero b es ahora 1
//b = a++;