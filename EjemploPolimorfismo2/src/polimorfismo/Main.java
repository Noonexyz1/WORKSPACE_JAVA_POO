package polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		Vehiculo v;
		v = new Turismo("SDFSD", "Nissan", "215", 5);
		System.out.println(" " + v.mostrarDatos());
		v.descripcion();
		
		System.out.println("--------------------------------");
		
		Vehiculo v1;
		v1 = new Deportivo("DDDDDD", "Nissansdsdf", "xcxc", 500);
		System.out.println(" " + v1.mostrarDatos());
		v1.descripcion();
		
		System.out.println("--------------------------------");
	//Cambiar este Deportivo por Vehiculo para notar la diferencia
		Vehiculo dep = new Deportivo("sdfsdfsdf", "MARCFAA", "MSDFSDFASDF", 3232323);
		System.out.println(dep.mostrarDatos());
		dep.descripcion();
		((Deportivo) dep).miDueno();
		dep.descripcion();
		
		System.out.println("--------------------------------");
		
		Vehiculo v2;
		v2 = new Furgoneta("xcxcxcxc", "Toyota", "2015", 500000);
		System.out.println(" " + v2.mostrarDatos());
		v2.descripcion();
		
		System.out.println("--------------------------------");
		Vehiculo c, d, g;
		c = new Vehiculo();
		System.out.println("El numero de vehiculos es " + Vehiculo.getContador());
		d = new Vehiculo();
		System.out.println("El numero de vehiculos es " + Vehiculo.getContador());
		g = new Vehiculo();
		System.out.println("El numero de vehiculos es " + Vehiculo.getContador());
		
		System.out.println("--------------------------------");
		
		Vehiculo furgo = new Furgoneta();		
		
		System.out.println(furgo.mostrarDatos());
	
		System.out.println("---------Casting de objetos----------");
		
		
		Vehiculo vehiculo1 = new Deportivo("xyz", "Toyota", "45215454", 999999);
		vehiculo1.mostrarDatos(); // solo puedo acceder a los metodos heredados y a los sobreescritos
		
		Deportivo deportivo1 = (Deportivo)vehiculo1;
		System.out.println("La cilindrada es de :" + deportivo1.getCilindrada());
		System.out.println("Mostrar datos de de deportivo con metodo padre sobre escrito:");
		deportivo1.metodoDeportivoPadre();//Si puede verse
		
	}
	
}
