package clasesInternasStatic;

public class Avionica {

	private String cia;
	
	
	public static class Matricula {
	/*
	 * Matricula es una clase interna static dentro de la clase Avionica; 
	 * el nombre de la clase, desde el exterior, es Avionica.Matricula. 
	 * Para crear un objeto de Matricula no se necesita un objeto de Avionica, 
	 * no hay una asociación entre ellos.
	 * */
		
		private String numMat;
		private Date fechaInicio;
		
		public Matricula(String nm) {

			numMat = nm;
			fechaInicio = new Date(12, 24, 1995);
		}
		// No pueden acceder a los miembros de la clase externa, excepto a los miembros de la misma clase. 
		public String getNombre() {
			return numMat;
		}
		
		public String toString() {
			return fechaInicio.mes + " " + fechaInicio.dia + " " + fechaInicio.anio + " / " + numMat;
		}
		
	}//fin de la clase interna Static
	
}
