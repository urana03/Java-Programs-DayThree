package com.bridgelabz.daythree;

public class SmallestElement {

	public static void main(String args[]) {
	int a[] = {10,20,30,40,50};
	int min=0;
	
	if(a[0] <= a[1] && a[0] <= a[2] && a[0] <= a[3] && a[0] <= a[4]) {
		
		min = a[0];
		System.out.println("The smallest number is: "+ min);
	}
	else if(a[1] <= a[0] && a[1] <= a[2] && a[1] <= a[3] && a[1] <= a[4]) {
		
		min = a[1];
		System.out.println("The largest number is: "+ min);
	}
    else if(a[2] <= a[0] && a[2] <= a[1] && a[2] <= a[3] && a[2] <= a[4]) {
		
		min = a[1];
		System.out.println("The largest number is: "+ min);
	}
    else if(a[3] <= a[0] && a[3] <= a[1] && a[3] <= a[2] && a[3] <= a[4]) {
		
		min = a[1];
		System.out.println("The largest number is: "+ min);
	}
    else {
    	
    	min = a[4];
		System.out.println("The largest number is: "+ min);
    }


	}
	
}


