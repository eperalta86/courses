package seccion3string;

public class C07EjemploStringExtensionArchivo {

	public static void main(String[] args) {
		
		
		String archivo = "alguna_imagen.jpeg";
		
		System.out.println("archivo.length() = " + archivo.length()); //estatico
		System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4)); //dinamico solo para jpeg
		
		//int i = archivo.indexOf("."); esto es solo efectivo si el string solo tiene un punto
		int i = archivo.lastIndexOf("."); //retorna la ultima ocurrencia del punto, por lo que el string puede tener multiples puntos anteriores y aun asi retornará la extension correcta.
		
		System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(i+1)); //dinamico para todas las extensiones
		
		
		
	}
}

