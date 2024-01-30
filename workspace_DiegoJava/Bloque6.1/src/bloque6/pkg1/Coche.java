package bloque6.pkg1;
public class Coche {
    private int velocidad,aceleracion;
    private String nombre;
    
    
    //Constructor
    public Coche(int velocidad,int aceleracion,String nombre){
        this.velocidad=velocidad;
        this.aceleracion=aceleracion;
        this.nombre=nombre;
    }
    
    
    //Set and Get
    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void acelerar(int aceleracion){
        this.aceleracion = aceleracion;
        velocidad = velocidad + aceleracion;
    }
    public void frenar(){
        velocidad = 0;
    }
    
}
