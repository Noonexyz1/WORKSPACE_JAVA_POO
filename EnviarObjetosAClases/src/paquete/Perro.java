package paquete;

public class Perro extends Animal{
	
	private final String marcaCroquetas;
	
	//Estoy creando el contructor convinando el del padre y este mismo
	public Perro(String nombre, String raza, String color, String tam, String marcaCroquetas) {
		super(nombre, raza, color, tam);//Constructor padre llamando con super
		this.marcaCroquetas = marcaCroquetas;
	}
	
	public void imprimeMarcaCroquetas() {
		System.out.println("La marca de las croquetas es: " + marcaCroquetas);
		
	}
	
	@Override
	public void imprimeInformacion() {
		System.out.println("DATOS DEL PERRO");
		System.out.println("Soy un perro");
		System.out.println("Mi marca de comida favorita es.." + marcaCroquetas);
	}
	
}
