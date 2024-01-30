package clasesAnonimas3;

public class NiExtenderNiImplementar {

	String nombre;
	
	public NiExtenderNiImplementar(String nombre) {
		this.nombre = nombre;
	}
	
	public void mostrarNombre() {
		System.out.println("El nombre es :" + nombre);
	}
	
	public NiExtenderNiImplementar objetoNew() {
		return null;
	}
}
