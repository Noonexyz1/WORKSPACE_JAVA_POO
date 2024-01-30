package ejercicio2;

public class Perro extends Canino{

	private String cuidador;
	
	
	
	public Perro(String tamaño,int edad,String nombre,int altura,int ancho,String amigo,String cuidador) {
		super(tamaño,edad,nombre,altura,ancho,amigo);
		this.cuidador=cuidador;
	}
	
	public void mensajeLobo() {
		cuidador="El lobo vive en los bosques:";
		System.out.println(cuidador);
	}
}
