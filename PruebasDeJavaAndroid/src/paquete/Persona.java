package paquete;

public class Persona {

	
	
	private String nombre;
	private int edad;
	
	private int PI = 3;
	
	
	public Persona(String nombre, int edad) {
		Persona.this.nombre = nombre;
		Persona.this.edad = edad;
	}


	public String getNombre() {
		return Persona.this.nombre;
	}
	public void setNombre(String nombre) {
		Persona.this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getPI() {
		return PI;
	}
	public void setPI(int pI) {
		PI = pI;
	}
	
	public Persona objeto() {
		return Persona.this;
	}
	
}
