package ejercicio2;

public class Tigre extends Felino{

	private String rayas;
	
	public Tigre(String tamaño,int edad,String nombre,int altura,int ancho,String garras,String rayas) {
		super(tamaño,edad,nombre,altura,ancho,garras);
		this.rayas=rayas;
	}
	
	public void mensajeTigre() {
		rayas="Este Tigre tiene rayas oscuras...";
		System.out.println(rayas);
	}
}
