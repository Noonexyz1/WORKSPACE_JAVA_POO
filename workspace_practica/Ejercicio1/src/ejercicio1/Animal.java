package ejercicio1;

public class Animal {

	private String raza;
	private String nombre;
	private int edad;
	private String carnivoro;
	
	//constructor;
	public Animal(String raza,String nombre,int edad,String carnivoro) {
		this.raza=raza;
		this.nombre=nombre;
		this.edad=edad;
		this.carnivoro=carnivoro;
	}

	//metodos Gets;
	public String getRaza() {
		return raza;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	
	public String getCarnivoro() {
		return carnivoro;
	}
	
	
	
	//Metodos;
	
	public void mostrar() {
		System.out.println("La Raza es:"+raza);
		System.out.println("El nombre es:"+nombre);
		System.out.println("El edad es:"+edad);
		carnivoroSioNo(carnivoro);
		
	}
	
	public void carnivoroSioNo(String carnivoro) {
		if(carnivoro.equals("Si")) {
			System.out.println("Este animal SI es Carnivoro...");
		}
		else {
			System.out.println("Este animal NO es Carnivoro...");
		}
	}
	
	
	
	
}
