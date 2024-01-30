package paquete;
import java.util.Scanner;
public class Main {

	private static Scanner entrada = new Scanner(System.in);
	private static Comprador[] vec = new Comprador[3];
	
	
	public static void llenarVector() {
		for(int i = 0; i < vec.length; i++) {
			System.out.println("Ingrese nombre del comprador " + (i + 1) );
			vec[i] = new Comprador(entrada.nextLine());
		}
	}
	public static void mostrarVector() {
		for (int i = 0; i < vec.length; i++) {
			System.out.println("Comprador " + (i + 1));
			vec[i].mostrarDatos();
		}
	}
	
//	public static Comprador crearUsuario() {
//		Comprador c = new Comprador("Jose");
//		return c;
//	}
	public static void mostrarUsuario(Comprador c) {
		c.mostrarDatos();
	}
	
	public static Vendedor crearVendedor() {
		Objeto vender = new Objeto("Celular", 100);
		Vendedor v = new Vendedor("Carlos", vender);
		return v;
	}
	public static void mostrarVemdedor(Vendedor v) {
		v.mostrarDatos();
	}
	
	public static void venderObjeto(Vendedor v, Comprador[] c) {
		boolean venta = false;
		boolean competir = false;
		boolean trato = false;
		int actualizador = 0;
		int senyal;
		
		System.out.println("----BAJADA DE PRECIO-----");
		System.out.println("OBJETO A LA VENTA");
		do {
			System.out.println("el precio del objeto " + v.getO().getNombreObjeto()+ " es: " + v.getO().getPrecioObjeto());
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].getNombre() +  " le interesa el precio?? escriba true si lo desea");
				venta = entrada.nextBoolean();
				if(venta == true) {
					venta = true;
					break;
				}
			}
			if (venta == false) {				
				System.out.println(v.getNombreVendedor() + " Ingrese nuevo precio de " + v.getO().getNombreObjeto());
				v.getO().setPrecioObjeto(entrada.nextInt());
			}
			
		} while (venta != true);
		
		senyal = v.getO().getPrecioObjeto();
		System.out.println("-----SUBIDA DE PRECIOS------");
		System.out.println("En esta etapa todos los usuarios pueden competir en precio para comprar el objeto");
		
		do {
			System.out.println("el precio del objeto " + v.getO().getNombreObjeto()+ " es: " + v.getO().getPrecioObjeto());
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i].getNombre() +  " le interesa competir?? escriba true si lo desea");
				competir = entrada.nextBoolean();
				if(competir == true) {
					System.out.println(c[i].getNombre() + " Ingrese el nuevo precio :");
					v.getO().setPrecioObjeto(entrada.nextInt());
					if (v.getO().getPrecioObjeto() > senyal) {
						actualizador = i;
						System.out.println(v.getNombreVendedor() + " El precio mejorado es:" + v.getO().getPrecioObjeto());
					}
				}
			}
			System.out.println(c[actualizador].getNombre() + " tiene el trato mas alto... ");
			System.out.println(v.getNombreVendedor() + " Desea otra ronda? escriba true si lo desea ");
			trato = entrada.nextBoolean();
		} while (trato == true);
		System.out.println("Usted" + v.getO().getNombreObjeto() + " hizo un trato con " + c[actualizador].getNombre());
	}
	
	public static void main(String[] args) {
		Vendedor v;
		llenarVector();
		System.out.println("MOSTRAR USUARIOS");
		mostrarVector();
		v = crearVendedor();
		System.out.println("MOSTRAR VENDEDOR");
		v.mostrarDatos();
		System.out.println("VENDER OBJETO");
		venderObjeto(v, vec);
	}
}
