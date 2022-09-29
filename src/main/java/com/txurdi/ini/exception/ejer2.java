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
public class ejer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean comp = true;

		while (comp) {
			try {
				System.out.println("Dime tu edad");
				String edad = sc.nextLine();
				int iedad = Integer.parseInt(edad);

				if (iedad > 0 && iedad <= 120) {
					comp = false;
					System.out.printf("tu edad es %s \n", edad);
					System.out.println("Agur");

				} else {
				
					System.out.println("Error,Vuelve a decirme tu edad");
									}

			} catch (NumberFormatException e) {
				System.out.println("Error,Solo caracteres numericos , escribe tu edad 0 -120");

			} catch (Exception e) {
				e.printStackTrace();
			}

		} // while

		sc.close();

	}

	
}
