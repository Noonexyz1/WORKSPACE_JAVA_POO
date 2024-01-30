package ejercicio5;
public class AppEjercicio5 {

    public static void main(String[] args) {
        MetodosEjercicio5 x;
        x=new MetodosEjercicio5();
        int a;
        x.leerDimencion();
        x.llenarMatriz();
        x.mostrarMatriz();
        x.contParImpar();
        System.out.println("Suma diagonal sec. es:"+x.sumDiagonalSec());
        System.out.println("El elemento en la posicion M es:"+x.posicionFC());
    }
    
}
