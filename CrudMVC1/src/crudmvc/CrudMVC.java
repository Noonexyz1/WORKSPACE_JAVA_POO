package crudmvc;

import controlador.CtrlProducto;
import modelo.ConsultasProducto;
import modelo.Producto;
import vista.FormularioProducto;

public class CrudMVC {

	public static void main(String[] args) {
		
		Producto mod = new Producto();
		ConsultasProducto modC = new ConsultasProducto();
		FormularioProducto frm = new FormularioProducto();
		
		CtrlProducto ctrl = new CtrlProducto(mod, modC, frm);
		ctrl.iniciar();
		frm.setVisible(true);

	}

}
