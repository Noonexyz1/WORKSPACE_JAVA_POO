package ejercicio2;

public class Leon extends Felino{

	private String melena;
	
	public Leon(String tamaño,int edad,String nombre,int altura,int ancho,String garras,String melena) {
		super(tamaño,edad,nombre,altura,ancho,garras);
		this.melena=melena;
	}
	
	public void mensajeLeon() {
		melena="El leon si posee melena...";
		System.out.println(melena);
	}
}
