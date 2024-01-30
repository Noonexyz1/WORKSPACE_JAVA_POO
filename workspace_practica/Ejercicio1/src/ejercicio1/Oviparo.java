package ejercicio1;

public class Oviparo extends Animal{

	private String vuelaono;
	
	public Oviparo(String raza,String nombre,int edad,String carnivoro,String vuela) {
		super(raza,nombre,edad,carnivoro);
		this.vuelaono=vuela;
		
	}
	
	public String getVuelaono() {
		return vuelaono;
	}

	public void voladorONO(String vuelaono) {
		if(vuelaono.equals("Si")) {
			System.out.println("Este animal SI es volador...");
		}
		else {
			System.out.println("Este animal NO es volador...");
		}
	}
}
