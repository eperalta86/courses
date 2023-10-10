package seccion2variables;

public class C04PrimitivosFloat {

	public static void main(String[] args) {
		
		float realFloat = 2.12e3f;//equivale a 2120f;
		float realFloatNegativo = 1.5e-10f; //0.00000000015f
		System.out.println("realFloat = " + realFloat);
		System.out.println("realFloatNegativo = " + realFloatNegativo);
		
		System.out.println("float corresponde en byte a: " + Float.BYTES);
		System.out.println("float corresponde en bites a: " + Float.SIZE);
		System.out.println("maximo valor para float: " + Float.MAX_VALUE);
		System.out.println("minimo valor para float: " + Float.MIN_VALUE);
		
		double realDouble = 3.4028235E39;
		System.out.println("realDouble = " + realDouble);
		
		System.out.println("double corresponde en byte a: " + Double.BYTES);
		System.out.println("double corresponde en bites a: " + Double.SIZE);
		System.out.println("maximo valor para double: " + Double.MAX_VALUE);
		System.out.println("minimo valor para double: " + Double.MIN_VALUE);
		
		var varFlotante = 3.1416;
		System.out.println("varFlotante: "+varFlotante);

	}

}
