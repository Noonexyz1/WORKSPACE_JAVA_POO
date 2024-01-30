package ejemplo;

public class Perro extends Animal{

	//Atributos de Perro
	
	//Metdodos de la clase Perro
	@Override //sobre escribe el metodo padre
	public void comer() {
		System.out.println("Estoy comiendo con mi platito...");
	}
	
	//si borro este override y creo una instancia de Perro en main..
	//...y le pongo a llamar al metodo comer(), como no hay ninguna
	//...entoces me me mostrara el metodo comer() de padre, (Osea el por defecto)
}
