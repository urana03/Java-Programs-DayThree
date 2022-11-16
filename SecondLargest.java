package com.bridgelabz.daythree;

public class SecondLargest {
	
	public static void main(String args[]) {
		
		int a[] = {10,50,40,60,100,90};
		System.out.println("The given array is: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+ " ");
		}
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
		System.out.print("The second largest number is: ");
		System.out.print(a[a.length -2]);
		
	}
}
