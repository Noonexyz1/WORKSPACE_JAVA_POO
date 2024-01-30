package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CrudUsuario {

	// -------------
		// Atributos
		// -------------
		
		Conexion bd = new Conexion();
		Usuario u = new Usuario();
		
		// -------------
		// Métodos
		// -------------
		public void consultarUsuarios() {
			
			try {
				String sql = "SELECT * FROM usuario";
				Statement statement = (Statement) bd.conectarMysql3().createStatement();
				ResultSet result = statement.executeQuery(sql);
					
				while(result.next()) {
					String codigo = result.getString("cod_usuario");
					String nombre = result.getString("nom_usuario");
					String apellido = result.getString("ape_usuario");
					String direccion = result.getString("dir_usuario");
					
					String output = "%s - %s - %s - %s";
					System.out.println(String.format(output, codigo, nombre, apellido, direccion));
					
				}
			}
			catch (Exception e) 
			{
				System.out.println("Error, Por favor revisa la sentencia SQL o tu código");
			}
		}
		
		
		
		
		
		public void agregarUsuario(String pNombre, String pApellido, String pDireccion)
		{
			try
			{
				u.setNombre(pNombre);
				u.setApellido(pApellido);
				u.setDireccion(pDireccion);
				
				String sql = "INSERT INTO usuario (nom_usuario, ape_usuario, dir_usuario) values (?, ?, ?) ";
				PreparedStatement statement = (PreparedStatement) bd.conectarMysql3().prepareStatement(sql);
				statement.setString(1, u.getNombre());
				statement.setString(2, u.getApellido());
				statement.setString(3, u.getDireccion());
				
				int rowsInserted = statement.executeUpdate();
				
				if(rowsInserted > 0)
				{
					System.out.println("Se agregó un nuevo Usuario con el nombre " + u.getNombre() + " y con apellido " + u.getApellido());
				}
				else
				{
					System.out.println("No se agregó el Usuario");
				}
			}
			catch (Exception e) 
			{
				System.out.println("Error con la sentencia SQL");
			}
			
		}
		
	
}
