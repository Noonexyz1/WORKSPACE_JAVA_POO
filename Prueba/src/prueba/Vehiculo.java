package prueba;

public class Vehiculo {

	//Atributos de la Clase
	private String marca;
	private String modelo;
	private double precio;
	
	//constructores, Gets and Sets y metodos propios
	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void arrancarMotor() {
		System.out.println("Prendiendo el motor... ");
	}
	public void apagarMotor() {
		System.out.println("Apagando motor... ");
	}
	
	
	
	
}
