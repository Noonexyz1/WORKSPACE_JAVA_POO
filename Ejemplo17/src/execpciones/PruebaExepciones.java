package execpciones;

import java.util.Scanner;

public class PruebaExepciones {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int resultado;
		
		num1 = 5;
		num2 = 0;
		resultado = num1 / num2;
		
		System.out.println("El resultado es... " + resultado);
		System.out.println("Hola mundo...");

		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Ingrese un numero... : ");
		numero = entrada.nextInt();
		System.out.println("El valor del numero es: " + numero);
		
		
	}
}
