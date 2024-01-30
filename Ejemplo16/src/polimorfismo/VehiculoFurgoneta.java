package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo{

	//Atributos de la Clase
	private int carga;
	
	//metodos de la clase
	public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}
	
	public int getCarga() {
		return carga;
	}

	@Override
	public String mostrarDatos() {
		return "La matricula del vehiculFurgoneta es: " + matricula + 
		 		"La marca del vehiculoFurgoneta es " + marca + 
		 		"El modelo del vehiculoFurgoneta es " + modelo + 
		 		"La carga del vehiculoFurgoneta es " + carga;
		
	}

	
}
