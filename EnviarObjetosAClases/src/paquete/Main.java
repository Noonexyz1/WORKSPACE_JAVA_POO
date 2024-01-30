package paquete;

public class Main {
	
	public static void main(String[] args) {
		
//		Perro p = new Perro("Fido", "Dober", "Negro", "Mediano", "Mascota Espacial");
//		Gato g = new Gato("Nieve", "Cachu", "Blanco", "Pequeño", "Basura Espacial");
//		
//		p.imprimeDatos();
//		p.imprimeMarcaCroquetas();
//		
//		
//		g.imprimeDatos();
//		g.imprimeDatosClasePadre();
		
		
		Animal p2, g2;
		
		p2 = new Perro("Shadow", "Pequines", "Plomo", "Pequeño", "Perritofeliz");
		g2 = new Gato("Otoño", "Lobi", "Blanco", "pequeño", "Grano de Oro");
		
		//Polimorfismo solo con Herencia y los @Overrides
		p2.imprimeInformacion(); //polimorfismo
		p2.imprimeInformacion();
		p2.imprimeDatos();
		
		
		System.out.println("...ENVIANDO UN PERRO A UN GATO EJEMPLO...");
		
		Perro perroPrueba = new Perro("Shadow", "Pequines", "Plomo", "Pequeño", "Perritofeliz");
		Gato gatoPrueba = new Gato("Otoño", "Lobi", "Blanco", "pequeño", "Grano de Oro");
		
		
		
		gatoPrueba.setPerro(perroPrueba);
		perroPrueba.imprimeDatos();
		perroPrueba.imprimeInformacion();
		
		System.out.println("+++++++Ahora retornando el objeto perro enviado a gato");
		
		
		Perro aux;
		aux = gatoPrueba.getPerro(perroPrueba);
		aux.imprimeDatos();
		aux.imprimeInformacion();
		
		
		
		
	}
	
}
