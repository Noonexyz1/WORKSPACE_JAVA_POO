package paquete;

public class Main {

	public static void main(String[] args) {
		int x;
		int y;
		
		//prueba referencias
		x = 5;
		
		//copiando referencia
		y = x;
		
		y = x - 1;
		
		System.out.println("El valor de y es: " + y);
		
		System.out.println("El valor de x es: " + x);
		
		
		
		String a = "";
		String b = "";
		
		a = "Hola...";
		b = a;
		b = "...Mundo";
		
		System.out.println("El valor de b es: " + b);
		System.out.println("El valor de a es: " + a);
		//no se pueden con valores primitivos
		
	}
}
