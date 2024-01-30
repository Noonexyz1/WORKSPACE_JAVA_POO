package paquete;

public class BarcoPasaje implements Barco {

	//Atributos
	private int eslora;
	private int numeroCamas = 101;
	
	//Constructor
	public BarcoPasaje() {
		System.out.println("Se crea objeto BarcoPasaje.");
	}	
	
	//Metodos
	@Override
	public void alarma() {
		System.out.println("Alarma del Barco Pasajero");
	}
	
	@Override
	public void mensajeSocorro(String mensaje) {
		alarma();
		System.out.println("SOS, SOS " + mensaje);
	}
	
}
