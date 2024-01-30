package paquete;

public class ClaseA {

	//Atributos de la clase
	private int atri1;
	private double atri2;
	private String atri3;
	private boolean bit;
	//constructores, getters and setters y metodos propios de la clase
	public ClaseA(int atri1, double atri2, String atri3, boolean bit) {
		this.atri1 = atri1;
		this.atri2 = atri2;
		this.atri3 = atri3;
		this.bit = bit;
	}
	public ClaseA(int atri1, double atri2, String atri3) {
		this.atri1 = atri1;
		this.atri2 = atri2;
		this.atri3 = atri3;
		this.bit = false;  // sin parametros de inicializacion :)
	}
	
	public int getAtri1() {
		return this.atri1;
	}
	public void setAtri1(int atri1) {
		this.atri1 = atri1;
	}
	public double getAtri2() {
		return this.atri2;
	}
	public void setAtri2(double atri2) {
		this.atri2 = atri2;
	}
	public String getAtri3() {
		return this.atri3;
	}
	public void setAtri3(String atri3) {
		this.atri3 = atri3;
	}
	public boolean getBit() {
		return bit;
	}
	public void setBit(boolean bit) {
		this.bit = bit;
	}
	
	public void mostrarDatos() {
		System.out.println(getAtri1() + " " + getAtri2() + " " + getAtri3() + " " + getBit());
	}
	
}











