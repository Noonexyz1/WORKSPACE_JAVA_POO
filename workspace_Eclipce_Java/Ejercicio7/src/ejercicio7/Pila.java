package ejercicio7;
import java.util.Scanner;
//Pila de numeros enteros
public class Pila {
	
	Scanner sc=new Scanner(System.in);
	private final int MAX = 20;
	private String v[] = new String [MAX];
	private int tope;
	
	Pila (){
		tope = 0;
	}
	boolean vacia (){
		if (tope == 0)
			return (true);
		else
			return (false);
	}
	boolean llena (){
		if (tope == MAX)
			return (true);
		else
			return (false);
	}
	void poner (String elem){
		if (llena ())
			System.out.println ("PILA LLENA...");
		else{
			tope++;
			v [tope] = elem;
		}
	}
	String quitar (){
		String elem ="";
		if (vacia ())
			System.out.println ("PILA VACIA...");
		
		else{
			elem = v [tope];
			tope--;
		}
		return (elem);
	}
	void imprimir (){
		System.out.println ("...IMPRIMIENDO LA PILA...");
		for (int i = tope ; i >= 1 ; i--)
			System.out.println (v [i]);
	}
	void llenarPila (){
		int n;
		String e;
		System.out.println ("cuantos elementos ??...");
		n = sc.nextInt();
		for (int i = 1 ; i <= n ; i++){
			System.out.print ("elemento?...... ");
			e = sc.next();
			poner (e);
		}
	}
}