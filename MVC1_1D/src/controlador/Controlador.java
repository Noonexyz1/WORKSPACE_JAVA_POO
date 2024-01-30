package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import interfaces.Reglas_del_programa;
import modelo.Modelo;
import vista.Vista;


public class Controlador implements Reglas_del_programa.Controlador, ActionListener {

	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		this.vista.btnNewButton.addActionListener(this);
		
	}
	
	@Override
	public void iniciar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
