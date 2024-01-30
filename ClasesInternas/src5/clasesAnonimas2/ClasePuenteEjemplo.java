package clasesAnonimas2;

import java.awt.Color;

public class ClasePuenteEjemplo extends Figurin{

	String mensaje;
	
	public ClasePuenteEjemplo(String m) {
		super();
		mensaje = m;
		
	}
	
	
	public void mostrarDatosDeClasePuenteEjemplo() {
		System.out.println("El mensaje de puente es:" + mensaje);
	}
	
	
	
	
	public Figurin disenar() {
		System.out.println("....este es el metodo Diseñar...");
			// un objeto un tanto particular... pero que de Figurin :)
		return new Figurin(new Color(4545), 45.45) {
		
			@Override
			public void metodoInterno1() {
				System.out.println("Metodo interno 1");
			}
			@Override
			public void metodoInterno2() {
				System.out.println("Metodo interno 2");
			}
			
		};
		
	}
	
}
