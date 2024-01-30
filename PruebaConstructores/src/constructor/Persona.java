package constructor;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String nombre) {
		this.nombre = nombre;
		
	}
	
	public void mostrarDatos() {
		System.out.println("Los datos son: " + nombre + " " + edad);
	}
	
	
}
