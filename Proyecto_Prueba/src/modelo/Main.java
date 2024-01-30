package modelo;

public class Main {

	public static void main(String[]args) {
		
		Conexion c = new Conexion();
		//c.conectarMysql();
		c.conectarMysql3();
		
		CrudUsuario cu = new CrudUsuario();
		cu.consultarUsuarios();
		
	}
	
}
