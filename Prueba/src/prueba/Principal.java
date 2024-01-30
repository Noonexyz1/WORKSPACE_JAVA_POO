package prueba;

public class Principal {

	//Atributos 
	static Vehiculo auto1 = new Vehiculo("Toyota", "20sdf", 204.45);
	static Vehiculo auto2 = new Vehiculo("Nissan", "HINO", 220.45);
	static Vehiculo ref;
	//Constructor, Getters and Setters y metodos propios
	public static void main(String[] args) {
	
		auto1.arrancarMotor();
		ref = auto1;
		ref.arrancarMotor();
		System.out.println(auto1.getMarca());
		System.out.println(ref.getMarca());
		
	}	
}
