package com.diegoxyz.regrecion;

import java.util.Random;

public class PrincipalRegrecion {

	
	/* Determinar las rectas de regresión y calcular la nota esperada en Química
	 *  para un alumno que tiene 7.5 en Matemáticas.
	 * */
	 
	
	static double[][] datos = new double[][] { {6  , 6.5 }, 
										 	   {4  , 4.5 }, 
										 	   {8  , 7   }, 
										 	   {5  , 5   },
										 	   {3.5, 4   } }; // Mi set de valores
	
	static Random azar = new Random();
	static double[] pesos = new double[] { azar.nextDouble(), azar.nextDouble()}; // Inicia los pesos al azar
	
	static boolean aprendiendo = true;
	static int salidaEntera; // valor de salida, valor esperado

	static int bias = 1;
	static int contador = 0;
	
	//tasa de prendisaje
	static double tasaAprende = 0.3;

	
	public static void main(String[] args) {

		while (aprendiendo) {
			aprendiendo = false;
			contador++;

			for (int cont = 0; cont < 5; cont++) { // recorre las filas
				// suma ponderada o hace el producto punto
				double salidaReal = pesos[0] * datos[cont][0] + pesos[1] * bias; // Calcula la salida real
																												

				/* 
				 QUITAMOS LA FUNCION DE ACTIVACION POR LA SENCILLA RAZON QUE ESTO ES UN PROBLEMA REGRESION PREDICION
				  // funcion de activacion
					if (salidaReal > 0) {
						salidaEntera = 1;

					} else {
						salidaEntera = 0; // Transforma a valores 0 o 1

					}
					
				  */

				
				// aqui, la neurona empieza a entrenar
				/*if (salidaReal != datos[cont][1]) { // Si la salida no coincide con lo esperado, cambia los pesos al
														// azar
					pesos[0] = azar.nextDouble() * 10 - azar.nextDouble() * 10;
					pesos[1] = azar.nextDouble() * 10 - azar.nextDouble() * 10;
					aprendiendo = true; // Y sigue buscando

				}*/
				
				
				
				double error = datos[cont][1] - salidaReal;
				if (error != 0){ //Si la salida no coincide con lo esperado, cambia los pesos con la fórmula de Frank Rosenblatt
					pesos[0] += tasaAprende * error * datos[cont][0];
					pesos[1] += tasaAprende * error * bias;
					aprendiendo = true; //Y sigue buscando
					
				}
				
				
				

			}

			System.out.println("Sigo aprendiendo...");

		}

		System.out.println("Iteraciones: " + contador);
		System.out.println("pesos 1: " + pesos[0]);
		System.out.println("pesos 2 umbral: " + pesos[1]);

		
		for (int cont = 0; cont < 5; cont++) { // Muestra el perceptron con la tabla AND aprendida
			double salidaReal = datos[cont][0] * pesos[0] + bias * pesos[1];
			
			if (salidaReal > 0) {
				salidaEntera = 1;

			} else {
				salidaEntera = 0;

			}

			System.out.println("Entradas: " + datos[cont][0] + " Salida: " + datos[cont][1] + " Perceptron: " + salidaReal);

		}

		
	}

}
