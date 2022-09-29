package com.txurdi.ini.exception;

import java.util.Scanner;

public class Dao {

	public static int ejecutar(Scanner sc) throws Exception {
	
		System.out.println("Ejecutamos Dao");
		return Utilidades.pedirEdad(sc);
	
		

	}

}
