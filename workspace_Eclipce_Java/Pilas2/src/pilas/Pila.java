package pilas;
import java.util.Scanner;
public class Pila {

	private int cima;
	private int[] pila;
	private int max;
	private int dato;
	private int n;
	Scanner entrada=new Scanner(System.in);
	
	Pila() {
		cima=-1;
		max=30;
		pila=new int[max];
		
	}
	
	
	public void push(int dato) {
		cima=cima+1;
		if(cima < pila.length) {	
			pila[cima]=dato;
		}
		else {
			cima=cima-1;
		}
	}
	public boolean empty() {
		
		if( cima == -1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void pop() {
		if(empty() == false) {
			pila[cima] = 0;
		}
		else {
			cima=cima-1;
		}
		
	}
	
	public int peek() {
		if( empty() == false) {
			return pila[cima];
		}
		else {
			return 0;
		}
	}
	public void llenar() {
		System.out.println("Cuantos elementos desea ingresar?:");
		n=entrada.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Ingrese un elemento");
			dato=entrada.nextInt();
			push(dato);
		}
	}
	
	public void mostrar() {
		for(int i=0; i<=cima; i++) {
			System.out.print("["+pila[i]+"]");
		}
	}
	
	
	public void sumaDePilas(Pila obj1, Pila obj2, Pila obj3) {
		int suma=0;
		System.out.println(" Cima objeto 1"+cima);
		/*while(obj1.) {
			
			suma=obj1.peek()+obj2.peek();
			obj3.push(suma);
			
		}*/	
		
	}
}
























