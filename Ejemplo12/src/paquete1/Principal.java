package paquete1;
import java.util.Scanner;
public class Principal {

	//Atributos de la Clase Principal
	private static Scanner entrada = new Scanner(System.in);
	private static Triangulo[] vector;
	
	//Metodos de la Clase Principal
	public static int limite() {
		System.out.println("Ingrese el limite de triangulos:");
		int lim;
		lim = entrada.nextInt();
		return lim;
	}
	
	public static void crearVector(int lim) {
		vector = new Triangulo[lim];
	}
	
	//si una variable o una variable de referencia es global..
	//...entonces solo se crean metodos Void, porque se su pone que 
	//...funcionan como los Setters
	public static void llenarVector() {
		double base, lado;
		for (int i = 0; i < vector.length; i++) {
			entrada.nextLine();
			System.out.println("Ingrese la base del triangulo " + (i + 1) + ":");
			base = entrada.nextDouble();
			System.out.println("Ingrese uno de los lados: " + (i + 1) + ":");
			lado = entrada.nextDouble();
			vector[i] = new Triangulo(base, lado);
			System.out.println(vector[i].mostrarDatos());
		}
	}
	
	public static void mayorArea() {
		double acu = 0;
		for (int i = 0; i < vector.length; i++) {
			if (vector[i].obtenerArea() >= acu) {
				acu = vector[i].obtenerArea();
			}
		}
		System.out.println("el Mayor area es : " + acu);
	}
	
	public static void main(String[] args) {
		crearVector(limite());
		llenarVector();
		mayorArea();	
	}
}
