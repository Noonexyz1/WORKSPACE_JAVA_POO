package ejercicio2;

public class Gato extends Felino{

	private String tomaLeche;
	
	public Gato(String tama�o,int edad,String nombre,int altura,int ancho,String garras,String tomaLeche) {
		super(tama�o,edad,nombre,altura,ancho,garras);
		this.tomaLeche=tomaLeche;
	}
	
	
	public void mensajeGato() {
		tomaLeche="El gato esta tomando leche...";
		System.out.println(tomaLeche);
	}
}
