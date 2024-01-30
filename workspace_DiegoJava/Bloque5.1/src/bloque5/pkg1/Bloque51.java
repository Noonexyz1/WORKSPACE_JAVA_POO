package bloque5.pkg1;
public class Bloque51 {

    public static void main(String[] args) {
        Guerrero g1 = new Guerrero();//primer objeto
        Guerrero g2 = new Guerrero();
        g1.nombre = "Goku";
        g1.fuerza = 99;
        g1.salud = 99;
        
        g2.nombre = "Vegeta";
        g2.fuerza = 80;
        g2.salud = 80;
        
        System.out.println("Le nombre del gerrero es "+g1.nombre);
        System.out.println("Le nombre del gerrero es "+g2.nombre);
    }
    
}
