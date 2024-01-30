package paquete;

public class Vendedor {

	private String nombreVendedor;
	private Objeto o;
	
	public Vendedor(String nombre, Objeto objeto) {
		this.nombreVendedor = nombre;
		this.o = objeto;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public Objeto getO() {
		return o;
	}

	public void setO(Objeto o) {
		this.o = o;
	}
	
	public void mostrarDatos() {
		System.out.println("El nombre del vendedor es: " + nombreVendedor);
		o.mostrarDatos();
	}
	
	
}
