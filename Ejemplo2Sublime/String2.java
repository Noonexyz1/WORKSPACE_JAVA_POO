import java.util.Scanner;
public class String2{
	public static void main(String[] args) {
		
		String usuario = "Diego";
		String pasword = "12345";

		String nombre = "";
		String contrasena = "";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese nombre de usuario:");
		nombre = entrada.nextLine();
		System.out.println("Inicio contraseña:");
		contrasena = entrada.nextLine();

		if ( nombre.equals(usuario) && contrasena.equals(pasword)) {
			System.out.println("Inicio de secion correcto..");
		}else {
			System.out.println("Datos incorrectos..");
		}
	}
}