package archivo;
import java.io.*;
import java.util.Scanner;
public class Principal {
	public static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		File miArchivo;//Para manipular el archivo
		PrintWriter escribir; //para escribir en el archivo
		String nombre;
							//ruta relativa
		miArchivo = new File("EjemploEscritura.txt");//Preparando el archivo
		if (!miArchivo.exists()) {
			System.out.println("Archivo creado");
			try {
				//codigo donde puede ocurrir errores
				miArchivo.createNewFile();
			} catch (Exception e) {
			}
		}
		else {
			System.out.println("El archivo ya existe");
			try {
				escribir = new PrintWriter(miArchivo, "utf-8");
				System.out.println("Ingrese su nombre...");
				nombre = entrada.nextLine();
				escribir.println(
"Hola Mundo... mi nombre es " + nombre);
				System.out.println("Hola Mundo... mi nombre es " + nombre);
				escribir.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	
	}
}
