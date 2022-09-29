package com.txurdi.ini.exception;

import java.util.Scanner;

public class Utilidades {

	/**
	 * Solicita la edad por pantalla
	 * 
	 * @param sc
	 * @return Edad en formato int
	 * @throws excepcion si no es un entero
	 */
	public static int pedirEdad(Scanner sc) throws Exception {
		int iedad = 0;

		try {
			System.out.println("dime tu edad");
			String edad = sc.nextLine();
			iedad = Integer.parseInt(edad);
		} catch (Exception e) {
			throw new Exception("Lanzamos la exception , error" + e.getMessage());
		}

		return iedad;

	}

}
