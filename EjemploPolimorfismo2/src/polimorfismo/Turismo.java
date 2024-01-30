package polimorfismo;

public class Turismo extends Vehiculo{

	private int numPuertas;
	
	public Turismo(String matricula, String marca, String modelo, int numPuertas) {
		super(matricula, marca, modelo);
		this.numPuertas = 5;
	}
	
	@Override
	public String mostrarDatos() {
		System.out.println("soy un turismo");
		return "La matricula es: " + matricula + " Marca " + marca + " Modelo " + modelo + " numPuertas " + this.numPuertas;
	}
	
	@Override
	public void descripcion() {
		System.out.println("yo llevo turistas por la carretera");
	}
}
