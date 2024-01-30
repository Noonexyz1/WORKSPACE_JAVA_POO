package paquete;

public class Gato {

	
	private String nombreGato;
	private int edadGato;
	
	
	
	public Gato() {
		this.nombreGato = "Fufi";
		this.edadGato = 3;
	}
	public Gato(String nombreGato, int edadGato) {
		this.nombreGato = nombreGato;
		this.edadGato = edadGato;
	}

	public String getNombreGato() {
		return nombreGato;
	}

	public void setNombreGato(String nombreGato) {
		this.nombreGato = nombreGato;
	}

	public int getEdadGato() {
		return edadGato;
	}

	public void setEdadGato(int edadGato) {
		this.edadGato = edadGato;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre del gato es: " + nombreGato);
		System.out.println("La edad del gato es: " + edadGato);
	}
	
}
