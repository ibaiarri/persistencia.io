package com.txurdi.ini.exception;

import java.util.Scanner;

/**
 * Ejer basico para pedir int por pantalla sin cspturar la excepion que pueda
 * lanzar
 * 
 * @author ibai arriola
 *
 */
public class ejer1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime tu edad");
		String edad = sc.nextLine();
		int iedad = Integer.parseInt(edad);
		System.out.printf("tu edad es %s \n",edad);
		System.out.println("Agur");
		sc.close();
		

	}

}
