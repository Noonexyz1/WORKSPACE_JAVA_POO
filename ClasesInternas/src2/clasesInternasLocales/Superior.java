package clasesInternasLocales;

class Superior {
	
	boolean lumin;
	
	public void limpiar() {
		
		/*
		 * Estas clases se definen dentro de un bloque de código y, 
		 * por consiguiente, son locales, su visibilidad se limita al bloque; 
		 * se crean dentro de un método, donde también se crean sus objetos.
		 */
		
		/*
		 * El ámbito de la clase local es el método donde se define; 
		 * por consiguiente no se declaran con etiquetas de visibilidad; 
		 * siempre están ocultas al exterior del bloque o método donde se han declarado. 
		 * Las clases locales pueden acceder a los miembros de la clase externa y 
		 * también a las variables del método declaradas con el atributo final.
		 */
		
		class Rotulo {
			
			String rotulo;
			
			Rotulo(String t) {
				rotulo = t;
			}
			
			public void imprimir() {
				System.out.println(rotulo);
				
				if(lumin) {
					limpiar();				
				}
			}
			
		}
		
		Rotulo uno = new Rotulo("Precuacion, Suelo mojado.");
		uno.imprimir();
	}
}
