import java.util.Scanner;
public class Diego{
	public static void main(String[] args) {
		String nombre1;
		String nombre2;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el primer nombre:");
		nombre1 = entrada.nextLine();
		System.out.println("Ingrese el segundo nombre:");
		nombre2 = entrada.nextLine();


		//equals(); comparar dos nombres completamente iguales
		//equalsIgnore(); direfernciar mayusculas de minsculas
		if (nombre1.equalsIgnore(nombre2)) {
			System.out.println("Los nombre son iguales...");
		}
		else {
			System.out.println("los nomobres son diferentes...");
		}
	}
}