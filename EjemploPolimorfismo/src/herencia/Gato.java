package herencia;

public class Gato extends Animal{

	private final String marcaArena;
	
	
	//Cuando programo el constructor el cosntructor por defecto desaparece
	public Gato(String marcaArena) {
		super();
		this.marcaArena = marcaArena;
	}
	
	public Gato() {
		super();//metodo constructor del padre pero el de argumentos vacios
		this.marcaArena = null;
		//me marca error porque is no pongo this. el atributo;
		//solo inicializa el de padre mas no el atributo;
	}
	
	public Gato(String nombre, String raza, String color, String tam, String marcaArena) {
		super(nombre, raza, color, tam);//Constructor padre llamando con super
		this.marcaArena= marcaArena;
	}
	
	
	public void imprimeMarcaArena() {
		System.out.println("La marca de la area es: " + marcaArena);
	}
	@Override
	public void imprimeDatos() {
		System.out.println("El nombre del animal es: " + nombre);
		System.out.println("La raza del animal es : " + raza);
		System.out.println("El color del animal es : " + color);
		System.out.println("El tamano del animal es : " + tam);
		imprimeMarcaArena();
	}
	
	public void imprimeDatosClasePadre() {
		super.imprimeDatos();
		
	}
	
	@Override
	public void imprimeInformacion() {
		System.out.println("DATOS DEL GATO");
		System.out.println("Soy un Gato");
		System.out.println("Mi marca de comida favorita es.." + marcaArena);
	}
	
}
