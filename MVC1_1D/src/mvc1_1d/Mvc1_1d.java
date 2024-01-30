package mvc1_1d;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Mvc1_1d {

	public static void main(String[] args) {
		
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		
		Controlador controlador = new Controlador(vista, modelo);
		controlador.iniciar();
		
	}

}



