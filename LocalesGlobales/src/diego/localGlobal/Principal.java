package diego.localGlobal;

public class Principal {

	//VARIABLES GLOBALES Prueba
	//si es de tipo final siempre se debe inicializar la variable
	private static double PI; //inicializa con 0.0
	private static int x;
	
	//Metodos de la clase
	
	public static void modificar() { 
		x = 5; //efecto lateral
	}
	
	public static void modificarVariablesMain() { //se puede? obvio que no //es otro mundo
		int a = 25;
		System.out.println("el valor de a es " + a + " metodo modificar, este ya es local y nada que ver con otro metodo");
	}
	
	public static void modificarVariablesMain(int a) { 
		//variable que es enviado desde main
		System.out.println("el valor de a es " + a + " resiviendo el valor de a enviado desde main");
	}
	
	public  static void pasoXValor(int x, double y) { //una ves que recive los valores de x y y desde main, estos pasan a ser locales del metodo
		System.out.println("el valor de mx es " + x + " desde el metodo pasoXValor()");
		System.out.println("el valor de ny es " + y + "desde el metodo pasoXValor()");
		x = x + 1;
		y = y + 1;
		System.out.println("E valor de mx ahora es " + x);
		System.out.println("el valor de yn ahora es " + y);
		
		System.out.println("el valor de x globla sigue siendo es... " + Principal.x + ""
				+ " por que primero lo inicie con valor de default luego lo inicialice con 3 en main luego lo cambie a 5 con otro metodo");
	}
	
	public  static void main(String[] args) {
		//variables locales de el metodo main
		int a = 10;
		System.out.println("Prueba de variables locales y globales");
		System.out.println("asignar le valor de pi desde main");
//		System.out.println("El valor de pi es : " + a);
	    PI = 3.1415;		//como si fuera main un constructor, el atributo debe ser estatico
		System.out.println("El valor de pi asignado es..." + PI);
		//this.x = 5; no puedo usar this dentro de metodos estaticos
		x = 3; //efecto lateral
		System.out.println("El valor de x es: " + x);
		System.out.println("Prueba de metodos...");
		modificar();//efecto lateral
		System.out.println("El valor de x ahora es... " + x);
		modificarVariablesMain(); //las variables de main no son variables globales de este metodo!! (En los metodos)						
		//alternativa
		modificarVariablesMain(a); //entonces enviamos la variable local inicializada de antemano o previamente
		//veamos si este valor de a es 10 como inciado en main
		System.out.println("El valor de a sin enviar a nada es " + a);
		//paso por valor 
		int m = 100;
		double n = 200;
		System.out.println("el valor de m es " + m);
		System.out.println("el valor de n es " + n);
		pasoXValor(m, n);
		System.out.println("Que valor tiene m y n despues del metodo anterior?");
		System.out.println("el valor de m es " + m);
		System.out.println("el valor de n es " + n);
	}
}
