package com.bridgelabz.daythree;

public class FrequencyArray {

	public static void main(String args[]) {
	
		int array[] = new int[] {10,20,20,30,40,40,50};
		
		int freq[] = new int[array.length];
		
		int counted = -1;
	
	
		for(int i = 0; i<array.length; i++) {
		
			int count = 1;
			
			for(int j=i+1; j<array.length; j++) {
				
				if(array[i] == array[j]) {
					
					count++;
				    freq[j] = counted;
				}
				
			}
			if(freq[i] != counted) 
				freq[i] = count;
		
		}
		for(int i=0; i<freq.length; i++) {
			if(freq[i] != counted)
			System.out.println("Element: "+array[i]+ " "+ "Frequency: "+freq[i]);
			
		
		}


	
	}

}