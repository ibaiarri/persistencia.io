package com.txurdi.ini;

import java.util.Iterator;

public class ForBreakpoint {	
	public static void main(String[] args) throws Exception {
		
		for(int i =0;i<300;i++) {
			System.out.println("iteracion " + i);
			if(i==107) {
				throw new Exception("fallardo ");
			}
		}//for
		
	}
}
