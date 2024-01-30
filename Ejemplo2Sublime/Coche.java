public class Coche{
	
	//variables mienbro Atributos
	String color;
	String marca;
	int km;

	// Un solo metodo
	public static void main(String[] args) {
		//coche1 es una referencia
		Coche coche1;
		coche1 = new Coche();

		coche1.color = "Blanco";
		coche1.marca = "Audi";
		coche1.km = 0;

		System.out.println("El color del coche es: " + coche1.color);
		System.out.println("La Marca del coche es: " + coche1.marca);
		System.out.println("El kilometraje del coche es: " + coche1.km);

		//coche copia es una copia de la referencia de coche1
		Coche cocheCopia; //se copia la direccion de los elementos mienbros y los metodos mienbros
		//copia la referencia de coche1
		cocheCopia = coche1;

		System.out.println("El color del coche es: " + cocheCopia.color);
		System.out.println("La Marca del coche es: " + cocheCopia.marca);
		System.out.println("El kilometraje del coche es: " + cocheCopia.km);
	}
}