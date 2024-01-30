package modelo;

import java.sql.Connection; //En este puede que tenga problemas
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Conexion {
	
	public String driver = "com.mysql.cj.jdbc.Driver";
	
	public String database = "tienda";
	public String username = "root";
	public String password = "";
	
	public Connection conn = null;
	public String url = "jdbc:mysql://localhost/" + database;
	
	//public String hostname = "127.0.0.1";
	//public String hostname = "localhost";
	//public String port = "3306";
	//public String port = "50";
	
	
	public Connection conectarMysql3() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(this.url, this.username, this.password);
			System.out.println("La conexión con la base de datos MySql fue exitosa...");
			
		} catch (Exception e) {
			System.out.println("Error de conexion..");
			e.printStackTrace();
			
		}
		
		return conn;
		
	}
	
	
	/* Otros connectores */
	public Connection conectarMysql() {
		try
		{
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("La conexión con la base de datos MySql fue exitosa...");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Error con la conexión");
		}
		
		return conn;
		
	}

	public Connection conectarMysql2() {
		try {
			Class.forName(driver);
			conn = (Connection) DriverManager.getConnection(this.url, this.username, this.password);
			System.out.println("La conexión con la base de datos MySql fue exitosa...");
			
		} catch (SQLException e) {
			System.err.println(e);
			
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		return conn;
		
	}
	
	
	
}
