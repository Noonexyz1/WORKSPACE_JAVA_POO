package ejercicio2;

public class Canino extends Animal{

	private String amigo;
	
	public Canino(String tama�o,int edad,String nombre,int altura,int ancho,String amigo) {
		super(tama�o,edad,nombre,altura,ancho);
		this.amigo=amigo;
	}
	
	
	public void  mensajePerro() {
		amigo="El perro es el mejor amigo del hombre...";
		System.out.println(amigo);
		
	}
}
