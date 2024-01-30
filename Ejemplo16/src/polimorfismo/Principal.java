package polimorfismo;

public class Principal {

	public static void main(String[] args) {
		//Vector de referencias;
		Vehiculo[] v = new Vehiculo[3];
		
		v[0] = new Vehiculo("125df", "Toyota", "125");
		v[1] = new VehiculoTurismo("turis45", "Nissan", "TRUCK", 4);
		v[2] = new VehiculoDeportivo("12XYZ", "Hilux", "5dfdf", 400);
		
		System.out.println(v[0].mostrarDatos());
		System.out.println(v[1].mostrarDatos());
		System.out.println(v[2].mostrarDatos());
		
		
		
	}
}
