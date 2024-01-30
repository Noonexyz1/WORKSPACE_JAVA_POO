package ejercicio1;

public class Perro extends Mamifero{

	private String domesticado;
	
	public Perro(String raza,String nombre,int edad,String carnivoro,String vuela,String domesticado) {
		super(raza,nombre,edad, carnivoro,vuela);
		this.domesticado=domesticado;
	}

	public String getDomesticado() {
		return domesticado;
	}
	
	
	public void domesticadoSIoNO(String domesticado) {
		if(domesticado.equals("Si")) {
			System.out.println("Este animal SI esta domesticado...");
		}
		else {
			System.out.println("Este animal NO esta domesticado...");
		}
	}
	
	
}
