package paquete;

public class Objeto {

	private String nombreObjeto;
	private int precioObjeto;
	
	public Objeto(String nombreObjeto, int precio) {
		this.nombreObjeto = nombreObjeto;
		this.precioObjeto = precio;
	}

	public String getNombreObjeto() {
		return nombreObjeto;
	}
	
	public void setNombreObjetos(String nombreObjeto) {
		this.nombreObjeto = nombreObjeto;
	}
	
	
	public void setPrecioObjeto(int precio) {
		this.precioObjeto = precio;
	}
	public int getPrecioObjeto() {
		return this.precioObjeto;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre del objeto es: " + nombreObjeto);
		System.out.println("El precio del objeto es:" + precioObjeto);
	}
	
}
