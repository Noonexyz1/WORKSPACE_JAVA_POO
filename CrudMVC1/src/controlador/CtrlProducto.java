package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.ConsultasProducto;
import modelo.Producto;
import vista.FormularioProducto;

public class CtrlProducto implements ActionListener {

	private Producto mod;
	private ConsultasProducto modC;
	private FormularioProducto frm;
	
	
	
	
	
	public CtrlProducto(Producto mod, ConsultasProducto modC, FormularioProducto frm) {
		super();
		this.mod = mod;
		this.modC = modC;
		this.frm = frm;
		
		this.frm.btnGuardar.addActionListener(this);
		this.frm.btnModificar.addActionListener(this);
		this.frm.btnEliminar.addActionListener(this);
		this.frm.btnLimpiar.addActionListener(this);
		this.frm.btnBuscar.addActionListener(this);
		
		
	}


	public void iniciar() {
		frm.setTitle("Productos");
		frm.setLocationRelativeTo(null);
		frm.txtId.setVisible(false);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(frm.btnGuardar)) {
			
			mod.setCodigo(frm.txtCodigo.getText());
			mod.setNombre(frm.txtNombre.getText());
			mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
			mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
		
			if (modC.registrar(mod)) {
				JOptionPane.showMessageDialog(null, "Registro Guardado");
				limpiar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Error al Guardar");
				limpiar();
				
			}
			
		} else if(e.getSource().equals(frm.btnModificar)) {
			
			mod.setId(Integer.parseInt(frm.txtId.getText()));
			mod.setCodigo(frm.txtCodigo.getText());
			mod.setNombre(frm.txtNombre.getText());
			mod.setPrecio(Double.parseDouble(frm.txtPrecio.getText()));
			mod.setCantidad(Integer.parseInt(frm.txtCantidad.getText()));
		
			if (modC.modificar(mod)) {
				JOptionPane.showMessageDialog(null, "Registro Modificado");
				limpiar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Error al Modificar");
				limpiar();
				
			}
			
		} else if(e.getSource().equals(frm.btnEliminar)) {
			
			mod.setId(Integer.parseInt(frm.txtId.getText()));
			
			if (modC.eliminar(mod)) {
				JOptionPane.showMessageDialog(null, "Registro Eliminado");
				limpiar();
				
			} else {
				JOptionPane.showMessageDialog(null, "Error al Eliminar");
				limpiar();
				
			}
			
		} else if(e.getSource().equals(frm.btnBuscar)) {
			mod.setCodigo(frm.txtCodigo.getText());
			
			if (modC.buscar(mod)) {
				
				//frm.txtId.setText(String.valueOf(mod.getId()));
				frm.txtId.setText(mod.getId() + "");
				
				frm.txtCodigo.setText(mod.getCodigo() + "");
				frm.txtNombre.setText(mod.getNombre() + "");
				frm.txtPrecio.setText(mod.getPrecio() + "");
				frm.txtCantidad.setText(mod.getCantidad() + "");
				
			} else {
				JOptionPane.showMessageDialog(null, "No se encontro Registro");
				limpiar();
				
			}
		} else {
			limpiar();
			
		}
		
	}
	
	public void limpiar() {
		
		frm.txtId.setText(null);
		frm.txtCodigo.setText(null);
		frm.txtNombre.setText(null);
		frm.txtPrecio.setText(null);
		frm.txtCantidad.setText(null);
		
	}

	
}
