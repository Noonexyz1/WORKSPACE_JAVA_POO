package herencia;

public class Main {
	
	public static void main(String[] args) {
		
//		Perro p = new Perro("Fido", "Dober", "Negro", "Mediano", "Mascota Espacial");
//		Gato g = new Gato("Nieve", "Cachu", "Blanco", "Peque�o", "Basura Espacial");
//		
//		p.imprimeDatos();
//		p.imprimeMarcaCroquetas();
//		
//		
//		g.imprimeDatos();
//		g.imprimeDatosClasePadre();
		
		
		Animal p2, g2;
		
		p2 = new Perro("Shadow", "Pequines", "Plomo", "Peque�o", "Perritofeliz");
		g2 = new Gato("Oto�o", "Lobi", "Blanco", "peque�o", "Grano de Oro");
		
		//Polimorfismo solo con Herencia y los @Overrides
		p2.imprimeInformacion(); //polimorfismo
		p2.imprimeInformacion();
		p2.imprimeDatos();
		
	}
	
}
