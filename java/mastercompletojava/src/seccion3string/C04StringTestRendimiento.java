package seccion3string;

public class C04StringTestRendimiento {

	public static void main(String[] args) {
		
		String a = "a";
		String b = "b";
		String c = a;
		
		StringBuilder sb = new StringBuilder(a);
		
		long inicio = System.currentTimeMillis(); //tiempo actual, corresponde a un numero que se calcula entre la fecha actual y el 1 de enero de 1970
		
		//i++ es abreviacion de i = i+1
		for(int i = 0; i < 100000; i++) {
			//c = c.concat(a).concat(b).concat("\n"); //500 => 7ms
			c += a + b + "\n"; // 500 => 10ms
			//"c += a" es abreviacion de c = c + a 
			
			//sb.append(a).append(b).append("\n"); //500 => 2ms
		}
		
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - inicio);
		//System.out.println("c = " + c);
		//System.out.println("sb = " + sb.toString());
		

		
		
		
		
		
	}
}

