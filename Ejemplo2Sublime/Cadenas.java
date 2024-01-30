import java.util.Scanner;
public class Cadenas{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena = "";
		System.out.println("Ingrese una cadena de caracteres:");
		cadena = entrada.nextLine();
		System.out.println("La cantidad de caracteres son: " + 
				cadena.length()
			);

		

		int a;
		int b;
		System.out.println("Que parte de la cadena desea obtener?");
		System.out.println("desde...:");
		a = entrada.nextInt();
		System.out.println("HAsta...");
		b = entrada.nextInt();


		String cadena1 = "";
		//Saca la cadema desde a hasta b
		cadena1 = cadena.substring(a, b);

		System.out.println("Cadena 1 :" + cadena);
		System.out.println("Cadena 2 : " + cadena1);

	}
}