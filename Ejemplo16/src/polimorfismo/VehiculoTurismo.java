package polimorfismo;

public class VehiculoTurismo extends Vehiculo{

	//Atributos de la Clase
	private int numeroDePuertas;
	
	
	//metodos de la clase
	
	public VehiculoTurismo(String matricula, String marca, String modelo, int numeroDePuertas) {
		super(matricula, marca, modelo);
		this.numeroDePuertas = numeroDePuertas;
	}
	
	public int getNumeroDePuertas() {
		return numeroDePuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "La matricula del vehiculoTurismo es: " + matricula + 
		 		"La marca del vehiculoTurismo es " + marca + 
		 		"El modelo del vehiculoTurismo es " + modelo + 
		 		"El numero de puertas del vehiculoTurismo es " + numeroDePuertas;
	}
	
	
}
