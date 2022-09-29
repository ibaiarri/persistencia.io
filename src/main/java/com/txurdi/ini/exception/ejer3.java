package com.txurdi.ini.exception;

import java.util.Scanner;

/**
 * Ejer basico para pedir int por pantalla cspturar la excepion que pueda lanzar
 * 
 * la edad debe estar comprendida entre 0 y 120
 * 
 * @author ibai arriola
 *
 */
public class ejer3 {

	public static void main(String[] args) {
		System.out.println("Comenzamos");
		try(Scanner sc = new Scanner(System.in)) {
			int result = Service.ejecutar(sc);
			System.out.printf("El resultado es %s \n", result);

		} catch (Exception e) {
			System.out.printf("Expection  %s \n" + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("terminamos");
	}
}
