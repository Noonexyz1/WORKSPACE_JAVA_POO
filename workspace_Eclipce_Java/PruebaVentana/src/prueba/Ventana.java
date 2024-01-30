package prueba;
import javax.swing.JFrame;
public class Ventana {
	
	public static void main(String [] args) {
		JFrame ventana=new JFrame();
		String titulo="HOLA MUNDO";
		
		ventana.setTitle(titulo);
		ventana.setSize(300,200);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		
	}
}
