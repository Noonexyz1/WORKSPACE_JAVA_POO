package clasesInternas;

public class Alumno {

	int edad;
	String nombre;
	Direccion direc;
	
								
	public Alumno(String nom, int num, String calle, String city, String codePostal) {
		direc = new Direccion(calle, num, city, codePostal);
		nombre = nom;
	}
	
	
	//clase interna
	public class Direccion{
		
		int numero;
		String calle;
		String ciudad;
		String code;
		
		public Direccion(String c, int n, String ct, String d ){
			calle = c;
			numero = n;
			ciudad = ct;
			code = d;
		}
		
		// sus métodos pueden acceder a los atributos de su clase externa.
	
		
		
	}
	
	
	
	
}
