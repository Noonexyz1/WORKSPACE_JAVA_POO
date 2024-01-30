package ejercicio1;

public class Pinguino extends Oviparo{

	private String marina;
	
	public Pinguino(String raza,String nombre,int edad,String carnivoro,String vuela,String marina) {
		super(raza,nombre,edad, carnivoro,vuela);
		this.marina=marina;
	}
	
	public String getMarina() {
		return marina;
	}

	public void marinaONO(String marina) {
		if(marina.equals("Si")) {
			System.out.println("Este animal SI es marino...");
		}
		else {
			System.out.println("Este animal NO es marino...");
		}
	}
	
}
