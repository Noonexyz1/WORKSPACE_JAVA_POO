package ejercicio2;

public class Lobo extends Canino{

	private String lugar;
	
	
	
	public Lobo (String tama�o,int edad,String nombre,int altura,int ancho,String amigo,String lugar) {
		super(tama�o,edad,nombre,altura,ancho,amigo);
		this.lugar=lugar;
	}
	
	public void mensajeLobo() {
		lugar="El lobo vive en los bosques:";
		System.out.println(lugar);
	}
	
}
