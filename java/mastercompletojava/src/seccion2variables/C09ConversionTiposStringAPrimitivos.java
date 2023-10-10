package seccion2variables;

public class C09ConversionTiposStringAPrimitivos {

	public static void main(String[] args) {
		
		String numeroStr = "50";
		int numeroInt = Integer.parseInt(numeroStr);
		System.out.println("numeroInt = " + numeroInt);
		
		String realStr = "98765.43";
		double realDouble = Double.parseDouble(realStr);
		System.out.println("realDouble = " + realDouble);
		
		String realStr2 = "98765.43e-3";
		double realDouble2 = Double.parseDouble(realStr2);
		System.out.println("realDouble2 = " + realDouble2);
		
		String logicoStr = "true"; //se puede ocupar TRUE o True o TruE, el jdk ocupa el equalsignorecase
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
		System.out.println("logicoBoolean = " + logicoBoolean);
		
		var numeroVarStr = "50";
		var numeroVarInt = Integer.parseInt(numeroVarStr);
		System.out.println("numeroVarInt = " + numeroVarInt);
		
	}
}



