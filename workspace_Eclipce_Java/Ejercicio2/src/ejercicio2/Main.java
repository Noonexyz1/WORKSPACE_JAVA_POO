package ejercicio2;
import java.util.Scanner;
public class Main {
	
	
	
	

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		Pila objeto=new Pila(10);
		Pila objeto2=new Pila(10);
		
		System.out.println("Ingrese la cantidad:");
		int n=entrada.nextInt();
		String e;
		for(int i=0; i<n; i++) {
			System.out.println("Ingrese la elementos:");
			e=entrada.next();
			objeto.push(e);
		}
		
		System.out.println("\n");
		
		while( !objeto.empty()) {
			e=objeto.peek();
			objeto2.push(e);
		}
		
		objeto2.mostrar();
		
	}
	
}
