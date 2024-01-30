package clasesAnonimas2;


public class Main {

	public static void main(String[] args) {
		
		Figurin f1 = new Figurin();
		f1.mostrarDatos();
		f1.metodoInterno1();
		f1.metodoInterno2();
		
	
		ClasePuenteEjemplo p = new ClasePuenteEjemplo("HOLA A TODOS");
		Figurin aux;
		p.disenar();
		aux = p.disenar();
		aux.metodoInterno1();
		aux.metodoInterno2();
		
		
	}
}
