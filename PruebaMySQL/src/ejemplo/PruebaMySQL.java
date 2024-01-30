package ejemplo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PruebaMySQL {

	public PruebaMySQL() {
		try {
			DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root", "la_clave");
			Statement s = conexion.createStatement();
			ResultSet rs = s.executeQuery("select * from persona");
			
			while(rs.next()) {
				System.out.println(rs.getInt("Id") + " " + rs.getString(2) + 
						" " + rs.getDate(3));
			}
			
			conexion.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new PruebaMySQL();
	}
	
}
