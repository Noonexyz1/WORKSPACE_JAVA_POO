package paquete;

public class Perro extends SerVivo{

	//atributos de la clase perro
	private String raza;
	
	//metodos de la Clase perro, constructor y gets and sets
	public Perro(String nombre, int edad, String color, String raza) {
		super(nombre, edad, color);
		this.raza = raza;
	}
	
	//porque no puedo hacerme otro constructor????
	//no puedo construir otro constructor pero para ello tengo el SET
	
//	public Perro(String raza) {
//		this.raza = raza;
//	}
	@Override
	public void comer() {
		System.out.println("Estoy comiendo con mi platito... soy perro");
	}
	@Override
	public void mostrarDatos() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
		System.out.println("Color: " + getColor());
		System.out.println("Raza: " + raza);
	}
	
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	
}
