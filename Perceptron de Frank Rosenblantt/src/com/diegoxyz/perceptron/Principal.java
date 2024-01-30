package com.diegoxyz.perceptron;

import java.util.Random;

public class Principal {

                //  Lote de entrada de dato,  salida esperada
	static int[][] datos = new int[][] {{ 1, 1, 1 }, 
										{ 1, 0, 0 },
										{ 0, 1, 0 }, 
										{ 0, 0, 0 }}; // Tabla de verdad AND
	static Random azar = new Random();
	static double[] pesos = new double[] { azar.nextDouble(), azar.nextDouble(), azar.nextDouble() }; // Inicia los
																										// pesos al azar
	static boolean aprendiendo = true;
	static int salidaEntera; // valor de salida, valor esperado

	static int bias = 1;
	static int contador = 0;
	
	//tasa de prendisaje
	static double tasaAprende = 0.3;
	

	public static void main(String[] args) {

		while (aprendiendo) { // Hasta que aprenda la tabla AND
			aprendiendo = false;
			contador++;

			for (int cont = 0; cont <= 3; cont++) { // recorre las filas
				// suma ponderada o hace el producto punto
				double salidaReal = pesos[0] * datos[cont][0] + pesos[1] * datos[cont][1] + pesos[2] * bias; // Calcula
																												// la
																												// salida
																												// real

				// funcion de activacion
				if (salidaReal > 0) {
					salidaEntera = 1;

				} else {
					salidaEntera = 0; // Transforma a valores 0 o 1

				}

				// aqui, la neurona empieza a entrenar con Frank Rosenblantt
				int error = datos[cont][2] - salidaEntera;
				if (error != 0){ //Si la salida no coincide con lo esperado, cambia los pesos con la fórmula de Frank Rosenblatt
					pesos[0] += tasaAprende * error * datos[cont][0];
					pesos[1] += tasaAprende * error * datos[cont][1];
					pesos[2] += tasaAprende * error * bias;
					aprendiendo = true; //Y sigue buscando
					
				}

			}

			System.out.println("Sigo aprendiendo...");

		}

		System.out.println("Iteraciones: " + contador);
		System.out.println("pesos 1: " + pesos[0]);
		System.out.println("pesos 2: " + pesos[1]);
		System.out.println("pesos 3 umbral: " + pesos[2]);

		for (int cont = 0; cont <= 3; cont++) { // Muestra el perceptron con la tabla AND aprendida
			double salidaReal = datos[cont][0] * pesos[0] + datos[cont][1] * pesos[1] + pesos[2];
			if (salidaReal > 0) {
				salidaEntera = 1;

			} else {
				salidaEntera = 0;

			}

			System.out.println("Entradas: " + datos[cont][0] + " y " + datos[cont][1] + " = " + datos[cont][2] + " perceptron: " + salidaEntera);

		}

	}

}
