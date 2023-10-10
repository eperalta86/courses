package seccion3string;

public class C03StringInmutabilidad {

	public static void main(String[] args) {
		
		String curso = "Programacion Java"; 
		String profesor = "Alan Brito";
		
		String resultado = curso.concat(profesor);
		System.out.println("curso = " + curso);
		System.out.println("resultado = " + resultado);
		
		
		//expresion lambda
		String resultado2 = curso.transform(c -> {
			return c +" con " + profesor;
		});
		
		System.out.println(curso); //curso sigue sin cambiar
		System.out.println(resultado2); //curso sigue sin cambiar
		
		String resultado3 = resultado.replace("a", "A");
		
		System.out.println(resultado3); //curso sigue sin cambiar
	}
}

