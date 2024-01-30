package ip;
import java.util.Scanner;
public class Main {

	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		String base = "";
		System.out.println("Ingrese una base:");
		base = entrada.nextLine();
		System.out.println("Su base es: " + base);
		System.out.println("Su ip es : " + base + "." + 0 + " Donde .0 es la identificacion");
		System.out.println("Sus posibles host son:");
		for (int i = 0; i <= 255; i++) {
			if (i != 255 && i != 0) {
				System.out.println(base + "." + i);
			}
			else {

				System.out.println("Su ip es : " + base + "." + 255 + "Donde .255 es el broadCast");
			}
		}
	}
}
