package ejercicio1;

public class Mamifero extends Animal{

	private String terrestreONO;
	
	public Mamifero(String raza,String nombre,int edad,String carnivoro,String terrestreONO) {
		super(raza,nombre,edad,carnivoro);
		this.terrestreONO=terrestreONO;
		
	}

	public String getTerrestreONO() {
		return terrestreONO;
	}
	
	public void terreste(String terrestreONO) {
		if(terrestreONO.equals("Si")) {
			System.out.println("Este animal SI es volador...");
		}
		else {
			System.out.println("Este animal NO es volador...");
		}
	}
	
	
}
