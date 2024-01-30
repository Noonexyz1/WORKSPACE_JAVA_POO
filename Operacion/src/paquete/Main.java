package paquete;
import java.util.Scanner;
public class Main {

	private static Scanner entrada = new Scanner(System.in);
	//private static Operacion o = new Operacion();
	private static Operacion o;
	
	public static void solicitar(int a, int b, int opcion) {
		if (opcion == 1) {
			o = new Suma();
			o.realizaOperacion(a, b);
			mostrarResultado(o);
		}
		else {
			if (opcion == 2) {
				o = new Resta();
				o.realizaOperacion(a, b);
				mostrarResultado(o);
				
			}
			else {
				if (opcion == 3) {
					o = new Multiplicacion();
					o.realizaOperacion(a, b);
					mostrarResultado(o);
					//mostrar resultado
				}
				else {
					if (opcion == 4) {
						o = new Division();
						o.realizaOperacion(a, b);
						mostrarResultado(o);
					}
					else {
						salir();
					}
				}
			}
		}
	}
	
	public static void mostrarResultado(Operacion x) {
		System.out.println(x.getRes());
		
	}
	
	public static void salir() {
		
	}
	
	public static void main(String[] args) {
		
		int a, b, opcion;
		System.out.println("Ingrese un valor");
		a = entrada.nextInt();
		System.out.println("Ingrese otr valor");
		b = entrada.nextInt();
		System.out.println("Que operacion desea realizar?");
		System.out.println("1 Sumar");
		System.out.println("2 restar");
		System.out.println("3 Multiplicar");
		System.out.println("4 Dividir");
		System.out.println("5 Salir");
		opcion = entrada.nextInt();
		solicitar(a,b,opcion);
		
		
		
		
	}
}
