package seccion2variables;

public class C05PrimitivosBoolean {

	public static void main(String[] args) {
		
		//los booleanos nos permiten trabajar con flujos de control.
		Boolean datoLogicoObjeto = true; //ya no es primitivo, es de referencia.
		boolean datoLogico = true;
		boolean datoLogico2 = Boolean.FALSE;
		boolean datoLogico3 = Boolean.FALSE.booleanValue();
		
		System.out.println("datoLogico: "+datoLogico);
		System.out.println("datoLogico2: "+datoLogico2);
		System.out.println("datoLogic3: "+datoLogico3);
		
		double d = 98765.43e-3; //98.76543
		float f = 12345e2f; //  123.45
		
		boolean datoLogico4 = true;
		datoLogico4 = d > f;
		System.out.println("datoLogico4 = "+datoLogico4);
		
		boolean esIgual = (3-2 == 1);
		
		System.out.println(esIgual);

	}

}
