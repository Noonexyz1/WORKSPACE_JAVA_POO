package paquete;

public class Main {

	public static void main(String[] args) {
//		ClaseExterna objExterno = new ClaseExterna();
//		ClaseExterna.ClaseInterna objInterno = objExterno.new ClaseInterna();
//		System.out.println(objExterno.x + objInterno.y);
		//ClaseExterna.ClaseInterna objInterna = new ClaseExterna.ClaseInterna();
		//System.out.println(objInterna.y); 
		
		ClaseExterna objExterno = new ClaseExterna();
		ClaseExterna.ClaseInterna objInterno = objExterno.new ClaseInterna();
		System.out.println(objInterno.objInternoMetodo());
		
	}
}
