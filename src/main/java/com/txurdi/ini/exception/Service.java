package com.txurdi.ini.exception;

import java.util.Scanner;

public class Service {

	
	public static int ejecutar(Scanner sc) throws Exception {
		
	
		System.out.println("Ejecutamos service");
		int n1 =Utilidades.pedirEdad(sc);
		int n2 =Dao.ejecutar(sc);
		return n1+n2;
		
	}

	
	
}
