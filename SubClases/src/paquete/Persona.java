package paquete;

public class Persona {

	//Atributos de la persona
	private String nombre;
	private int edad;
	
	public Persona() {
		this.nombre = "Diego";
		this.edad = 24;
	}
	
	
	public void mostrarDatosPersona() {
		System.out.println("EL nombre de la persona es:" + nombre);
		System.out.println("La edad de la persona es: " + edad);
	}
	
	
	
	public static class Ropa{
		//Atributos
		private String marca;
		private static String color;
		
		//Metodos de la clase
		public Ropa() {
			this.marca = "Adidas";
			//this.color = "Rojo";
		}
		public String getMarca() {
			return this.marca;
		}
		public static void setColor(String a) {
			Ropa.color = a;
		}
		public void mostrarDatosRopa() {
			System.out.println("La marca de la ropa es:" + marca);
			System.out.println("El color de la ropa es: " + color);
		}
	
	}
	public class Mascota{
		//Atributos 
		private String raza;
		private String nombreMascota;
		
		//Metodos de la clase
		public Mascota() {
			this.raza = "Doberman";
			this.nombreMascota = "Fido";
		}
		public void mostrarDatosMascota() {
			System.out.println("La marca de la ropa es:" + raza);
			System.out.println("El color de la ropa es: " + nombreMascota);
		}

	}
	
}
