package ejercicio1;
import java.util.Scanner;
public class Principal {

	static Scanner entrada = new Scanner(System.in);
	static Cuadrilatero c, cc;
	
	public static void determinar(float lado1, float lado2) {
		if (lado1 == lado2) {
			c = new Cuadrilatero(lado1);
			System.out.println( c.getPerimetro() );
			System.out.println( c.getArea() );
		}
		else {
			cc = new Cuadrilatero(lado1, lado2);
			System.out.println( cc.getPerimetro() );
			System.out.println( cc.getArea() );
		}
	}
	
	
	
	//metodos de la clase
	public static void main(String[] args) {
		
		float lado1, lado2;
		System.out.println("Ingrese el primer lado:");
		lado1 = entrada.nextFloat();
		System.out.println("Ingrese el segundo lado:");
		lado2 = entrada.nextFloat();
		determinar(lado1, lado2);
		
		
	}
}
