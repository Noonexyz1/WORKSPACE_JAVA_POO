package ejercicio1;

public class Amfibios extends Animal{

	private String venenosoONO;
	
	public Amfibios(String raza,String nombre,int edad,String carnivoro,String  venenosoONO) {
		super(raza,nombre,edad,carnivoro);
		this.venenosoONO= venenosoONO;
		
	}

	public String getVenenosoONO() {
		return venenosoONO;
	}
	
	
	public void terreste(String venenosoONO) {
		if(venenosoONO.equals("Si")) {
			System.out.println("Este animal SI es volador...");
		}
		else {
			System.out.println("Este animal NO es volador...");
		}
	}
	
}
