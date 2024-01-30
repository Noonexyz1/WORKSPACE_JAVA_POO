package mvc1;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Mvc1 {

	public static void main(String[] args) {
		
		Vista view = new Vista();
		Modelo mod = new Modelo();
		
		Controlador ctrl = new Controlador(view, mod);
		ctrl.iniciar();
		
		view.setVisible(true);
		
		
	}
	

}


