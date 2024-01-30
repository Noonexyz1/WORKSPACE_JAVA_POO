package paquete;

public class Usuario {

	//Atributos
	private String nombre;
	private int cantidad;
	
	//Cosntructores, Gets and Sets y los metodos propios
	public Usuario(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidad() {
		return this.cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void getAtributos() {
		System.out.println("Nombre de usuario: " + nombre);
		System.out.println("Cantidad del usuario: " + cantidad);
	}
	
	public void retirarCantidad(int restaCantidad) {
		this.cantidad = this.cantidad - restaCantidad;
	}
	public void sumarCantidad(int sumaCantidad) {
		this.cantidad = this.cantidad + sumaCantidad;
	}
	
}





