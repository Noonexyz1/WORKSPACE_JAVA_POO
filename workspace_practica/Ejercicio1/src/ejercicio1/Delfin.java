package ejercicio1;

public class Delfin extends Mamifero{

	private String inteligente;
	
	
	public Delfin(String raza,String nombre,int edad,String carnivoro,String vuela,String inteligente) {
		super(raza,nombre,edad, carnivoro,vuela);
		this.inteligente=inteligente;
	}


	public String getInteligente() {
		return inteligente;
	}
	
	public void inteligenteSIoNO(String inteligente) {
		if(inteligente.equals("Si")) {
			System.out.println("Este animal SI es inteligente...");
		}
		else {
			System.out.println("Este animal NO es inteligente...");
		}
	}
	
	
}
