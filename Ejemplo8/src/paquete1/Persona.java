package paquete1;

public class Persona {

	//Variables miembro
	private final String nombre;
	private int edad;
	
	//metodos mienbro de la Clase Persona
	//Constructor
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre es " + nombre );
		System.out.println("La edad es " + edad);
	}
	
	//metodos Getters y Setters
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	
//	public void setNombre(String nombre) {
//		this.nombre = nombre;
//	}
	
	
}








