package ejercicio2;

public class Perro extends Canino{

	private String cuidador;
	
	
	
	public Perro(String tama�o,int edad,String nombre,int altura,int ancho,String amigo,String cuidador) {
		super(tama�o,edad,nombre,altura,ancho,amigo);
		this.cuidador=cuidador;
	}
	
	public void mensajeLobo() {
		cuidador="El lobo vive en los bosques:";
		System.out.println(cuidador);
	}
}
