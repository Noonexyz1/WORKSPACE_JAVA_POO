package ejercicio2;

public class Felino extends Animal{

	private String garras;
	
	public Felino(String tamaño,int edad,String nombre,int altura,int ancho,String garras) {
		super(tamaño,edad,nombre,altura,ancho);
		this.garras=garras;
	}
	
	public void mostrargarras() {
		System.out.println("todos los felinos tienes garras para cazar");
	}
	
	
}
