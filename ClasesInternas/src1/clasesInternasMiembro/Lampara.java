package clasesInternasMiembro;

//Estas clase no pueden tener otra visbilidad que no sea public
public class Lampara {

	private String forma;
	private boolean encendida;
	private Bombilla bom;
	
	public Lampara(String fm) {
		forma = fm;
		encendida = false;	
	}
	
	public void cambiarBombilla(int dePot) {
		bom = new Bombilla(dePot);
	}
	
	
	//clase interna pueden tener visibilidad public o private
	//pero si esta �ltima es privada, s�lo se pueden crear objetos desde los m�todos de la clase externa.
	//Recuerde que un m�todo de la clase interna puede utilizar atributos de la externa. 
	public class Bombilla{
		
		private int potencia;
		
		public Bombilla(int p) {
			potencia = p;
		}
		
	}
}
