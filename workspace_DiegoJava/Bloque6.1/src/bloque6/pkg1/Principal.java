package bloque6.pkg1;
public class Principal {

    public static void main(String[] args) {
        Coche toyota = new Coche(0,6,"Hola");
        
        toyota.setAceleracion(0);
        toyota.setVelocidad(5);
        toyota.setNombre("Prius");
        
        System.out.println("EL nombre de mi coche es "+toyota.getNombre()+" y la velocidad de "+toyota.getVelocidad());
    }
    
}
