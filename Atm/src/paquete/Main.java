package paquete;
import java.util.Scanner;
public class Main {

	//Atributos 
	static Scanner entrada = new Scanner(System.in);
	static Usuario usuario1 = new Usuario("Diego", 10000);
	static Usuario usuario2 = new Usuario("Jose", 15000);
	static Usuario usuario3 = new Usuario("Carlos", 13000);
	static Usuario ref;
	
	//Metodos de la clase Main
	public static void atm() {
		int opcion;
		System.out.println("1. Encender ATM.");
		System.out.println("2. Apagar ATM.");
		opcion = entrada.nextInt();
		if (opcion == 1) {
			encender();
		}
		else {
			if (opcion == 2) {
				apagar();
			}
		}
	}
	
	public static void encender() {
		int opcion;
		System.out.println("1. Iniciar sesion.");
		System.out.println("2. Apagar ATM.");
		opcion = entrada.nextInt();
		if (opcion == 1) {
			inicioSesion();
		}
		else {
			if (opcion == 2) {
				apagar();
			}
		}
	}
	public static void apagar() {
		System.out.println("Apagando...");
		System.out.println("...zZzZ");
	}
	
	public static void inicioSesion() {
		entrada.nextLine();
		String nombre;
		System.out.println("INICIO DE SESION");
		System.out.println("Ingrese nombre");
		nombre = entrada.nextLine();
		//Los String se comparan con equals()
		//if(nombre == usuario1.getNombre())
		if(nombre.equals(usuario1.getNombre()) ) {
			System.out.println("Si paso al if");
			ref = usuario1;
			menu(ref);
		}
		else {
			if(nombre.equals(usuario2.getNombre())) {
				ref = usuario2;
				menu(ref);
			}
			else {
				if (nombre.equals(usuario3.getNombre())) {
					ref = usuario3;
					menu(ref);
				}
				else {
					System.out.println("...Cuenta Equivocada...");
					System.out.println("Presione ENTER para intentar de nuevo");
					inicioSesion();
				}
			}
		}
		//Ejecutaba el menu de uno de los ifs y al salir ejeutaba el menu siguiente 
		//...al finalizar el metodo
		//me aparecia una cargar de programa por recursion
		//menu(ref);
	}
	
	public static void menu(Usuario ref) {
		int opcion;
		int depo;
		String nombreNuevo;
		String nombreTransfer;
		System.out.println("1. Ver estado de cuenta.");
		System.out.println("2. Depositar.");
		System.out.println("3. Retirar.");
		System.out.println("4. Editar nombre de usuario.");
		System.out.println("5. Transferir a alguien.");
		System.out.println("6. Cerrar sesion.");
		opcion = entrada.nextInt();
		if(opcion == 1) {
			ref.getAtributos();
			menu(ref);
		}
		if (opcion == 2) {
			System.out.println("Cuanto desea depositar?");
			depo = entrada.nextInt();
			ref.sumarCantidad(depo);
			System.out.println("Hecho...");
			menu(ref);
		}
		if (opcion == 3) {
			System.out.println("Cuanto desea retirar?");
			depo = entrada.nextInt();
			ref.retirarCantidad(depo);
			System.out.println("Hecho...");
			menu(ref);
		}
		if (opcion == 4) {
			entrada.nextLine();
			System.out.println("Ingrese nuevo nombre.");
			nombreNuevo = entrada.nextLine();
			ref.setNombre(nombreNuevo);
			System.out.println("Hecho...");
			menu(ref);
		}
		if (opcion == 5) {
			entrada.nextLine();
			System.out.println("Ingrese el nombre de la persona a tranferir:");
			nombreTransfer = entrada.nextLine();
			System.out.println("Ingrese la cantidad a transferir.");
			depo = entrada.nextInt();
			if (nombreTransfer.equals(usuario1.getNombre())) {
				transferencia(usuario1, depo);
				menu(ref);
			}
			else {
				if(nombreTransfer.equals(usuario2.getNombre())) {
					transferencia(usuario2, depo);
					menu(ref);
				}
				else {
					if (nombreTransfer.equals(usuario3.getNombre())) {
						transferencia(usuario3, depo);
						menu(ref);
					}
					else {
						System.out.println("Ese nombre no se encuentra registrado.");
						System.out.println("Intente de nuevo...");
						menu(ref);
					}
				}
			}
		}
		if (opcion == 6) {
			salirSesion();
		}
	}
	
	public static void transferencia(Usuario usuario,int depo) {
		ref.retirarCantidad(depo);
		usuario.sumarCantidad(depo);
		System.out.println("Hecho...");
	}
	
	public static void salirSesion() {
		encender();
	}

	public static void main(String[] args) {
		atm();
	}
}







