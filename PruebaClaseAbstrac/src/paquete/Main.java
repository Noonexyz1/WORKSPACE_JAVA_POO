package paquete;

public class Main {

	public static void main(String[] args) {
		
		SerVivo vivo1 = new SerVivo() {
			@Override
			public void alimentarse() {
				System.out.println("Me alimento de alimentos");
				
			}
		};
		vivo1.alimentarse();
		vivo1.dormir();
		//todos los que heredan de Servivo, heredan su metodo dormir()
		
		SerVivo vivo2 = new Planta();
		vivo2.alimentarse();
		vivo2.dormir();
		
		SerVivo vivo3 = new Animal() {
			@Override
			public void alimentarse() {
				System.out.println("Me pudo alimentar de lo que sea pero por la boca pero soy un animal");
			}
		};
		vivo3.alimentarse();
		vivo3.dormir();
		
		SerVivo vivo4 = new Carnivoro();
		vivo4.alimentarse();
		vivo4.dormir();
		
		SerVivo vivo5 = new Herbivoro();
		vivo5.alimentarse();
		vivo5.dormir();
		
		SerVivo vivoEjemplo = new SerVivo() {
			
			@Override
			public void alimentarse() {
				// O bien no puedo hacerlo, esto depente... los ejemplos estan arriba
				System.out.println("Ejemplo de objeto isntanciado de una clase abstracta");
			}
		};
		//necesariamente debo sobreescirbir el metodo abstracto si quiero una instancia de una clase abstracta
		vivoEjemplo.alimentarse();
	}
}
