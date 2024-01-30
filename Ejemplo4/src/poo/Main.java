package poo;

import java.util.Scanner;

public class Main {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		Persona p;
		String nombre;
		int edad;
		System.out.println("Ingrese el nombre de la persona:");
		nombre = entrada.nextLine();
		System.out.println("Ingrese la edad de la persona:");
		edad = entrada.nextInt();
		p = new Persona(nombre, edad);
		
		p.mostrarDatos();
		
	}
}
