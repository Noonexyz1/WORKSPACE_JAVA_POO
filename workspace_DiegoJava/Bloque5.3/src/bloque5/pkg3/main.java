package bloque5.pkg3;
public class main {

    public static void main(String[] args) {
        Guerrero g1=new Guerrero();//instanciar
        g1.setnombre("Goku");//nombre = "Goku";
        g1.setFuerza(100);
        g1.setSalud(99);
        System.out.println(g1.getnombre());
        System.out.println(g1.getFuerza());
        System.out.println(g1.getSalud());
        
    }
    
}
