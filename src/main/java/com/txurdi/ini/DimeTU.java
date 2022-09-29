package com.txurdi.ini;

import java.util.Scanner;

public class DimeTU {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su nombre");
		String nombre= sc.nextLine();
		
		
		System.out.println("Escriba su apellido");
		String apellido= sc.nextLine();
		
		
		System.out.printf("Bienvenido %s %s . hasta luego ", nombre,apellido);
		
		sc.close();
		
	}
	
	
}
