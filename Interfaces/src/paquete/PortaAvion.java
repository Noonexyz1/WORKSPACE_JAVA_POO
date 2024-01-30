package paquete;

public class PortaAvion implements Barco{

	
	private int aviones  = 19;
	private int tripulacion;
	
	
	public PortaAvion(int marinos) {
		this.tripulacion = marinos;
		System.out.println("Se crea objeto PortaAviones.");
	}
	

	@Override
	public void alarma() {
		System.out.println("Marineros a sus pustos.");
	}
	
	@Override
	public void mensajeSocorro(String mensaje) {
		System.out.println("SOS, SOS " + mensaje);
	}
	
}
