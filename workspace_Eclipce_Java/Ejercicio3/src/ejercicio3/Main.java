package ejercicio3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Pila objeto=new Pila();
		Pila objeto2=new Pila();
		Scanner entrada=new Scanner(System.in);
		System.out.println("Cuantos elementos desea ingresar?");
		int n=entrada.nextInt();
		String e;
		for(int i=0; i<n; i++) {
			System.out.println("Ingrese elemento:");
			e=entrada.next();
			objeto.poner(e);
		}
		objeto.imprimir();
		while( !objeto.vacia()) {
			objeto2.poner(objeto.quitar());;
		}
		objeto2.imprimir();
		}
}
