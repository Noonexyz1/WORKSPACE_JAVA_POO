package paquete;
import java.util.Scanner;
public class Principal {

	//Atributos 

	
	//Constructor, Get and Set y los metodos Propios
	public static void main(String[] args) {
	
		double pres;
		Scanner entrada = new Scanner(System.in);
		Auto a1 = new Auto();
		
		a1.arrancarAuto();
		a1.apagarAuto();
		
		System.out.println("Ingrese el precio del auto: ");
		pres = entrada.nextDouble();
		a1.setPrecio(pres, a1);
		System.out.println("El precio del auto es:" + a1.getPrecio());
		
	}
}
