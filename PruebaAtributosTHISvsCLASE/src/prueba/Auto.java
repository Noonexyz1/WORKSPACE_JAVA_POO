package prueba;

public class Auto {

	//Atributos
	private String marca;
	private int km;
	private static int precio;
	
	public Auto() {
		this.marca = "Toyota";
		this.km = 0;
	}
	
	public Auto(String marca, int km) {
		this.marca = marca;
		this.km = km;
	}
	
	public void mostrarDatos() {    						//Clave
		System.out.println("el nombre de la marca es : " + this.marca);
		System.out.println("El kilometraje del auto es: " + km);
		System.out.println("El precio del auto es::" + Auto.precio);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public static int getPrecio() {
		return precio;
	}

	public static void setPrecio(int precio) {
		Auto.precio = precio; //no me funciona this porque this hace referencia al objeto actual por defecto
	} //Esto significa que solo es de la clase, que solo le pertenece a la clase
	
	
	
	
	
	
	
	
	
}
