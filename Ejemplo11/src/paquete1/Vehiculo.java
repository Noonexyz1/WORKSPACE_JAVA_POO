package paquete1;

public class Vehiculo {

	//Atributos de mi clase
	private String marca;
	private String modelo;
	private float precio;
	
	//metodos de mi clase Principal
	public Vehiculo(String marca, String modelo, float precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void mostrarDatos() {
		System.out.println("La marca es " + marca);
		System.out.println("El modelo es " + modelo);
		//System.out.println("El precio es " + precio);
	}
	
}
