package ejemplo;

public class Principal {

	// Atributos de la clase Principal
	
	
	
	// Metodos de la clase Principal
	public static void main(String[] args) {
		//nombre de la Referencia y tipo de referencia
		Animal a;
		Persona p;
		Perro pr;
		Vaca v;
		
		a = new Animal();
		p = new Persona();
		pr = new Perro();
		v = new Vaca();
		
		a.comer(); //la llave tiene que ser del mismo tipo de la clase al que queremos acceder
		p.comer();
		pr.comer();
		v.comer();
	
	}
}
