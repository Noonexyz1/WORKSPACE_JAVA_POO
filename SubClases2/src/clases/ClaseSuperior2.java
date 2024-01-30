package clases;

//clase superior
public class ClaseSuperior2 { //solo pueden ser publicos, asbtracos o finales

//	private static String nombreSuperior2; //si esque se usa un metodo statico con estas varibles, entonces estos de aqui tambien deben ser staticos
//	private static int edadSuperior2;
	
	private String nombreSuperior2;
	private int edadSuperior2;
	
	public ClaseSuperior2(String nombre, int edad) {
		this.nombreSuperior2 = nombre;
		this.edadSuperior2 = edad;
	}
	
	
	public String getNombreSuperior2() {
		return nombreSuperior2;
	}


	public void setNombreSuperior2(String nombreSuperior2) {
		this.nombreSuperior2 = nombreSuperior2;
	}


	
	
	public int getEdadSuperior2() {
		return edadSuperior2;
	}


	public void setEdadSuperior2(int edadSuperior2) {
		this.edadSuperior2 = edadSuperior2;
	}

	public void mostrarDatosSuperior2() {
		System.out.println("El nombre ClaseSuperior2 es: " + nombreSuperior2 );
		System.out.println("La edad de la ClaseSuperior2 es : " + edadSuperior2);
	}
	
	
	
	
	//Clase interior
	public class ClaseInferior2{
		private String nombreInferior2;
		private int edadInferior2;
		private static final String statico = "Soy variable estatica final pero privado";
		
		
		public ClaseInferior2(String nombre, int edad) {
			this.nombreInferior2 = nombre;
			this.edadInferior2 = edad;
		}
		
		public String getNombreInferior2() {
			return nombreInferior2;
		}
		public void setNombreInferior2(String nombreInferior2) {
			this.nombreInferior2 = nombreInferior2;
		}


		public int getEdadInferior2() {
			return edadInferior2;
		}
		public void setEdadInferior2(int edadInferior2) {
			this.edadInferior2 = edadInferior2;
		}

		public String staticoString() {
			return ClaseInferior2.statico;
		}
		
		
		public void mostrarDatosInferior2() {
			System.out.println("En nomobre claseInferior2 es: " + nombreInferior2);
			System.out.println("la eda de claseInferior2 es : " + edadInferior2);
		}
	}
}














