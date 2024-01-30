package ejercicio5;
import java.util.Scanner;
public class Main {

	
	
	public static void main(String [] args) {
		
		Pila objeto1=new Pila(10);
		llenar(objeto1);
	}
	
	public static void llenar(Pila objeto1) {
		int n;
		String e;
		String a;
		Scanner entrada=new Scanner(System.in);
		System.out.println("cuantos numeros va ha ingresar?");
		n=entrada.nextInt();
		for(int i=0 ;i<n; i++) {
			System.out.println("ingrese elemento:");
			e=entrada.next();
			objeto1.push(e);
		}
		
		
		
		
		
		
		
	}
	
	
	
}
