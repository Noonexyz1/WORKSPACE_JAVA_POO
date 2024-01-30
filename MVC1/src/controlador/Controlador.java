package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener {

	private Vista view;
	private Modelo model;
	
	public Controlador(Vista view, Modelo model) {
		this.view = view;
		this.model = model;
		this.view.btnNewButton.addActionListener(this);
		
	}
	
	public void iniciar() {
		view.setTitle("MVC Multiplicar");
		view.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		model.setNumeroUno(Integer.parseInt(view.textField.getText()));
		model.setNumeroDos(Integer.parseInt(view.textField_1.getText()));
		model.multiplicar();
		view.textField_2.setText(String.valueOf(model.getResultado()));
		
	}
	
}
