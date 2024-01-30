package poo;
public class Persona {
	//variabes miembro de mi clase
	String nombre;
	int edad;
	
	//Metodo miembro de clase persona Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("En nombre de la persona es" + nombre);
		System.out.println("En edad de la persona es" + edad);
	}
}
