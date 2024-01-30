package clases;

public class ClaseSuperior {

	private String nombre;
	private int edad;
	
	
	public ClaseSuperior(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void mostrarDatos() {
		System.out.println("El nombre clase superior : " + this.nombre);
		System.out.println("La edad clase superior : " + this.edad);
		
	}
	
	
	
	
	public static class ClaseInterior{
		
		private String nombreInterior;
		private int edadInterior;
		
		public ClaseInterior(String nombre, int edad) {
			this.nombreInterior = nombre;
			this.edadInterior = edad;
		}
		
		public String getNombreInterior() {
			return nombreInterior;
		}
		public void setNombreInterior(String nombreInterior) {
			this.nombreInterior = nombreInterior;
		}

		public int getEdadInterior() {
			return edadInterior;
		}
		public void setEdadInterior(int edadInterior) {
			this.edadInterior = edadInterior;
		}


		public void mostrarDatosInterior() {
			System.out.println("nombre clase interior :" + nombreInterior);
			System.err.println("Edad clase interior : " + edadInterior);
		}
		
		public static void metodoMensajeStatico() {
			System.out.println("Hola mundo Statico");
		}
		
	}
}
