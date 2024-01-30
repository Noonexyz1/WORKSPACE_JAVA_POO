package polimorfismo;

public class VehiculoDeportivo extends Vehiculo{

	//Atributos de la Clase
	private int cilindrada;
	
	//metodos de la clase
	public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String mostrarDatos() {
		return "La matricula del vehiculoDeportivo es: " + matricula + 
		 		"La marca del vehiculoDeportivo es " + marca + 
		 		"El modelo del vehiculoDeportivo es " + modelo + 
		 		"La cilindrada del vehiculoDeportivo es " + cilindrada;
		
	}

}
