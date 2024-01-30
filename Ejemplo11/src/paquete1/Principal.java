package paquete1;
import java.util.Scanner;
public class Principal {
	//Atributos de mi clase Principal
	private static Scanner entrada = new Scanner(System.in);
	private static Vehiculo[] v;
		
	//Metodos de mi Clase Principal
	public static int limiteAutos() {
		int lim;
		System.out.println("Ingrese el limite de autos:");
		lim = entrada.nextInt();
		return lim;
	}
	
	public static Vehiculo[] crearVetor(int limite) {
		v = new Vehiculo[limite];
		return v;
	}

	public static void llenarVector(Vehiculo[] v) {
		String marca, modelo;
		float precio;
		for (int i = 0; i < v.length; i++) {
			entrada.nextLine();
			System.out.println("Ingrese Marca del auto " + (i + 1));
			marca = entrada.nextLine();
			System.out.println("Ingrese Modelo del auto " + (i + 1));
			modelo = entrada.nextLine();
			System.out.println("Ingrese Precio del auto " + (i + 1));
			precio = entrada.nextFloat();
			v[i] = new Vehiculo(marca, modelo, precio);
		}
	}
	
	public static void mostrarVector(Vehiculo[] v) {
		for (int i = 0; i < v.length; i++) {
			v[i].mostrarDatos();
			System.out.println("Y el precio es... " + v[i].getPrecio());
		}
	}
	
	public static void vehiculoBarato(Vehiculo[] vector) {
		float flag = vector[0].getPrecio();
		for (int i = 1; i < vector.length; i++) {
			if (vector[i].getPrecio() <= flag) {
				flag = vector[i].getPrecio();
			}
		}
		System.out.println("El vehiculo mas barato es ..." + flag );
	}
	
	public static void main(String[] args) {
		int lim;
		Vehiculo[] vec;
		lim = limiteAutos();
		vec = crearVetor(lim);
		llenarVector(vec);
		mostrarVector(vec);
		vehiculoBarato(vec);
	}
}













