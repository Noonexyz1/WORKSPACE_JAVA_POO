package paquete;

public class Main {

	public static void main(String[] args) {
	
		Nino n1 = new Nino("Jose", 6);
		
		n1.mostrarDatos();
	
		System.out.println("....Modificando los datos al gato del niño....");
		n1.getG().setNombreGato("Gato con botas"); //toda esta linea es el metodo para cambiar de nombre al gato del niño
		
		n1.mostrarDatos();

		Gato g = new Gato();
		
	}
}
