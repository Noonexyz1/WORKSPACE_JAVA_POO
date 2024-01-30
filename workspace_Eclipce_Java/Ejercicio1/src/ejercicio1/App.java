package ejercicio1;
import java.util.Scanner;
public class App {

	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x;
		String nombre;
		Pila objeto=new Pila(5);
		Pila objeto2=new Pila(5);
		System.out.println("Ingrese cuantos elementos desea ingresar en la pila:");
		x=entrada.nextInt();
		for(int i=0; i<x; i++) {
			System.out.println("Ingrese primer elemento:");
			nombre=entrada.next();
			objeto.push(nombre);
		}
		objeto.mostrar();
		
		System.out.println("\n-------Intercambiar los");
		
		String g,y;
		g=objeto.peek();
		y=g;
		objeto2.push(g);
		while( !objeto.empty() == false) {
			g=objeto.peek();
			if( y!=g) {
				objeto2.push(g);
			}
			else {
				objeto2.push(objeto.peek());
			}
		}
		
		
		objeto2.mostrar();
		
	}
}
