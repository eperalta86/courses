import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Pruebas {

	public static void main(String[] args) {
		
		List<Objeto> lista = new ArrayList<Objeto>();
		
		Objeto a = new Objeto();
		a.setA("Hola");
		lista.add(a);
		
		BigInteger numeroLegalizacionHC = new BigInteger("202300002107");
		
        for(int i=0; i<lista.size(); i++) {
        	lista.get(i).setB(numeroLegalizacionHC);
        }
        
        for(Objeto o: lista) {
        	System.out.println(o.getA());
        	System.out.println(o.getB());
        }

	}

}
