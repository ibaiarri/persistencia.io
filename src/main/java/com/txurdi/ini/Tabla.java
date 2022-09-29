package com.txurdi.ini;

import java.util.ArrayList;
import java.util.List;

public class Tabla {

	public static void main(String[] args) {
		final String TAB_20 ="---------------";
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");
		names.add("Alice");
		names.add("Bob");
		names.add("Steve");

		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Ford");
		cars.add("Ferrari");
		cars.add("Maruti");
		cars.add("Vokesvagen");
		
		
		
		System.out.printf("%-20s%s%n","Coche","Modelo");
		System.out.printf("%-20s%s%n",TAB_20,TAB_20);
		for (String coche : cars) {
			System.out.printf("%-20s%s%n", coche, names.get(cars.indexOf(coche)));
		}

	}

}
