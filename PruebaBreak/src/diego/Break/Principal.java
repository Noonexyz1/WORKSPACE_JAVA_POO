package diego.Break;

public class Principal {

	public static void main(String[] args) {
		//Prueba break
		int tope = 10;
		for (int i = 0; i < tope; i++) {
			if( i == 5) {
				System.out.println("Viene el break..");
				break;
			}
			else {
				System.out.println(i);
			}
		}
		System.out.println("ya sali por Break");
		
		
		System.out.println("ahora con fors anidados");
		int tope2 = 20;
		for (int i = 0; i < tope; i++) {
			for (int j = 0; j < tope2; j++) {
				if(j == 15) {
					System.out.println("Viene el break..");
					break; //si hay un break dentro de un solo for entonces salta solo este for
				}
				else {
					System.out.println(" " + i +" " + j);
				}
			}
			System.out.println("ahora estoy en el for j..");
		}
		System.out.println("Ahora estoy en ej for i");
		
		
		System.out.println("Prueba Break con if");

		int x = 1;
		int y = 2;
		if(x == 1) {
			if(y == 2) {
				System.out.println("Estoy en if y");
			}
		}
		System.out.println("No se puede usar break con if");
		
	}
}











