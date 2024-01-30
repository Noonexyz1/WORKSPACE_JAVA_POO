package paquete;

public class Comprador {

	private String nombre;
	
	public Comprador(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void mostrarDatos() {
		System.out.println("El nombre del comprador es: " + nombre);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
