package com.bridgelabz.daythree;

public class DuplicateElement {
	
	public static void main(String args[]) {
		
		int a[] = {2,2,3,4,5,5,6,6};
	    System.out.println("The numbers that are repeated:");
		for(int i =0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i] == a[j]) {
					
					a[i]=a[j];
					
					System.out.print(a[j]+ " ");
				}
			}
		}
		
	}
}


