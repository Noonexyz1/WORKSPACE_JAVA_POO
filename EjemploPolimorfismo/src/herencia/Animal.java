package herencia;

public class Animal {

	protected String nombre;
	protected String raza;
	protected String color;
	protected String tam;
	private final String tipo;
	
	public Animal() {
		this.nombre = null;
		this.raza = null;
		this.color = null;
		this.tam = null;
		this.tipo = null;
	}

	public Animal(String nombre, String raza, String color, String tam) {
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
		this.tam = tam;
		this.tipo = "Terrestre";
	}
	
	public void imprimeDatos() {
		System.out.println("El nombre del animal es: " + nombre);
		System.out.println("La raza del animal es : " + raza);
		System.out.println("El color del animal es : " + color);
		System.out.println("El tamano del animal es : " + tam);
		System.out.println("El tipo es del animal es : " + tipo);
	}
	
	public void imprimeInformacion() {
		System.out.println("IMPRIME DATOS DEL ANIMAL...");
		System.out.println("Soy un animal");
	}
}











