package paquete;

public class SerVivo {

	//atributos de la clase perro
	private String nombre;
	private int edad;
	private String color;
	
	//metodos de la Clase perro, constructores y gets and sets
	public SerVivo(String nombre, int edad, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
		//tambien puedo colocar lo que se me antoje
	}
	
	public void dormir() {
		System.out.println("Estoy durmiendo... soy ser Vivo");
	}
	public void comer() {
		System.out.println("Estoy comiendo... soy ser Vivo");
	}
	public void despertar() {
		System.out.println("Me estoy levantando... soy ser Vivo");
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Color: " + color);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getColor() {
		return color;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
}







