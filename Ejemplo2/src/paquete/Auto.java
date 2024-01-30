package paquete;

import java.util.Scanner;

public class Auto {

	//Atributos
	private String color;
	private String marca;
	private String modelo;
	private double precio;
	
	//Constructor, Get and Set y los metodos
	public Auto(String color, String marca, String modelo, double precio) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public Auto() {
		
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		//Aqui puedo elaborarlo muscho mas
		
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	public void arrancarAuto() {
		System.out.println("El auto ya arranco...");
	}
	public void apagarAuto() {
		System.out.println("El auto se apago...");
	}
	
	
	public void setPrecio(double precio2, Auto a1) {
		Scanner entrada = new Scanner(System.in);
		if (precio2 <= 0) {
			System.out.println("Debes ingresar un precio mayor a 0...");
			System.out.println("Vuela a ingresar el precio");
			a1.precio = entrada.nextDouble();
			setPrecio(a1.precio, a1);
		}
		else {
			this.precio = precio2;
		}	
	}
	
}
