package paquete;

public class Mascota {

	private String nombreMascota;
	private String colorMascota;
	
	public Mascota(String nombreMascota, String colorMascota) {
		
		this.nombreMascota = nombreMascota;
		this.colorMascota = colorMascota;
		
	}
	

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public String getColorMascota() {
		return colorMascota;
	}

	public void setColorMascota(String colorMascota) {
		this.colorMascota = colorMascota;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre de la mascota es: " + nombreMascota);
		System.out.println("El colo de la mascota es:" + colorMascota);
	}
	
}
