package ejercicio2;

public class Tigre extends Felino{

	private String rayas;
	
	public Tigre(String tama�o,int edad,String nombre,int altura,int ancho,String garras,String rayas) {
		super(tama�o,edad,nombre,altura,ancho,garras);
		this.rayas=rayas;
	}
	
	public void mensajeTigre() {
		rayas="Este Tigre tiene rayas oscuras...";
		System.out.println(rayas);
	}
}
