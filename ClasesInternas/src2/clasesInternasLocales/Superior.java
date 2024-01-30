package clasesInternasLocales;

class Superior {
	
	boolean lumin;
	
	public void limpiar() {
		
		/*
		 * Estas clases se definen dentro de un bloque de c�digo y, 
		 * por consiguiente, son locales, su visibilidad se limita al bloque; 
		 * se crean dentro de un m�todo, donde tambi�n se crean sus objetos.
		 */
		
		/*
		 * El �mbito de la clase local es el m�todo donde se define; 
		 * por consiguiente no se declaran con etiquetas de visibilidad; 
		 * siempre est�n ocultas al exterior del bloque o m�todo donde se han declarado. 
		 * Las clases locales pueden acceder a los miembros de la clase externa y 
		 * tambi�n a las variables del m�todo declaradas con el atributo final.
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
