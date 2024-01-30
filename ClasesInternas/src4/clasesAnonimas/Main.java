package clasesAnonimas;

public class Main {

	public static void main(String[] args) {
		
		Persona p = new Persona("Jose", 12);
		Persona q = new Persona("Victor", 23);
		
		
		/*
		 * Este tipo de clases internas no se identifican con un nombre, 
		 * se definen a la vez que se crea la instancia u objeto de la clase; 
		 * de ellas no se pueden crear múltiples objetos, sólo el ligado con la definición;
		 * */
		
		p.mostrar(new Inmaterial() {
			//Me creo una objeto anomino y luego se envia
			@Override
			public String datCadena() {
				return "Cadena desde objeto 1";
			}
		});
		
		//Otra llamada
		q.mostrar(new Inmaterial() {
			
			@Override
			public String datCadena() {
				return "Cadena desde objeto 2";
			}
		});
		
		
	}
}
