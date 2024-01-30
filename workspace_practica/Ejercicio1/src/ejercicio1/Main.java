package ejercicio1;
import java.util.Scanner;
public class Main {
	
	public static void main(String [] args) {
		
		
		Scanner entrada=new Scanner(System.in);
		String raza;
		String nombre;
		int edad;
		String carnivoro;
		String vuelaono;
		String marina;
		
		
		System.out.println("Ingrese Raza:");
		raza=entrada.nextLine();
		System.out.println("Ingrese Nombre");
		nombre=entrada.nextLine();
		System.out.println("Ingrese Edad:");
		edad=entrada.nextInt();
		System.out.println("Ingrese Si si es carnivoro o No caso contrario:");
		carnivoro=entrada.nextLine();
		System.out.println("Ingrese Si si vuela o No caso contrario:");
		vuelaono=entrada.nextLine();
		System.out.println("Ingrese Si si es marina o No caso contrario:");
		marina=entrada.nextLine();
		
		Pinguino especie=new Pinguino(raza,nombre,edad,carnivoro,vuelaono,marina);
		especie.mostrar();
		especie.voladorONO(vuelaono);
		especie.marinaONO(marina);
		
		
		
		
	}
}
