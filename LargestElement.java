package com.bridgelabz.daythree;

public class LargestElement {

	public static void main(String args[]) {
		
		int a[] = {10,20,30,40,50};
		int max = 0;
		
		if(a[0] >= a[1] && a[0] >= a[2] && a[0] >= a[3] && a[0] >= a[4]) {
			
			max = a[0];
			System.out.println("The largest number is: "+ max);
		}
		else if(a[1] >= a[0] && a[1] >= a[2] && a[1] >= a[3] && a[1] >= a[4]) {
			
			max = a[1];
			System.out.println("The largest number is: "+ max);
		}
        else if(a[2] >= a[0] && a[2] >= a[1] && a[2] >= a[3] && a[2] >= a[4]) {
			
			max = a[1];
			System.out.println("The largest number is: "+ max);
		}
        else if(a[3] >= a[0] && a[3] >= a[1] && a[3] >= a[2] && a[3] >= a[4]) {
			
			max = a[1];
			System.out.println("The largest number is: "+ max);
		}
        else {
        	
        	max = a[4];
			System.out.println("The largest number is: "+ max);
        }
	}
}
