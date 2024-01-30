package abstrac;

public class Principal {


	public static void main(String[] args) {
//		SerVivo ser = new SerVivo();
		Planta plan = new Planta();
		plan.alimentarse(); 
	
		AnimalCarnivoro car = new AnimalCarnivoro();
		car.alimentarse();
		
		
	}
}
