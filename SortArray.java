package com.bridgelabz.daythree;

public class SortArray {
	
	public static void main(String args[]) {
		
		int a[] = {6,5,4,3,2,1};
		int val=0;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					
					val = a[i];
					a[i] = a[j];
				    a[j]=val;
					
				}
				
				
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0; i<a.length; i++) {
			
			System.out.print(a[i] + " ");
		}
	}

}
