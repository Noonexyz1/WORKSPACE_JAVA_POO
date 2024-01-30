package paquete;

public class Main {

	//Atributos
	private String marca;
	private String modelo;
	private String color;
	private double precio;
	
	//Constructores, Getters And Setters y metodos propios de la clase
	public Main(String marca, String modelo, String color, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.precio = precio;
	}
	public Main() {
		
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return modelo;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}
	
	public static void main(String[] args) {
		
		Main carro;
		carro = new Main("Toyota", "2019df", "Negro", 25.5);
		carro.marca = "Nissan";
		System.out.println("La marca del auto es: " + carro.marca);
		carro.setMarca("Ahora la marca es BMW");
		System.out.println("La marca del auto es: " + carro.marca);
	}
}









