package ejercicio2;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String tama�o;
		int edad;
		 String nombre;
		int altura;
		 int ancho;
		 String lugar;
		 String amigo;
		
		 System.out.println("Ingrese tama�o:");
	     tama�o=entrada.nextLine();
	     System.out.println("Ingrese edad:");
	     edad=entrada.nextInt();
	     System.out.println("Ingrese Nombre:");
	     nombre=entrada.nextLine();
	     System.out.println("Ingrese altura:");
	     altura=entrada.nextInt();
	     System.out.println("Ingrese Ancho:");
	     ancho=entrada.nextInt();
	     System.out.println("Ingrese el lugar:");
	     lugar=entrada.nextLine();
	     System.out.println("es amigable:");
	     amigo=entrada.nextLine();
	     
	     Lobo animal=new Lobo(tama�o,edad,nombre,altura,ancho,amigo,lugar);
	     animal.come();
	     animal.dormir();
	     animal.mensajeLobo();
	}
}
