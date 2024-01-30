package modelo;

public class Usuario {

		// -------------
		// Atributos
		// -------------
		//Mi objeto de la tabla en mi base de datos
		private int codigo;
		private String nombre;
		private String apellido;
		private String direccion;
		
		
		// -------------
		// Métodos
		// -------------
		public int getCodigo()
		{
			return codigo;
		}
		
		public void setCodigo(int pCodigo)
		{
			this.codigo = pCodigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
	
}
