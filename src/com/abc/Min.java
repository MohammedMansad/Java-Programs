package com.abc;

public class Min {

	public static void main(String[] args) {
		
	int[] arr= {1233,4,9,8,45,33,5,89,2};
	int min=arr[0];
	
	
	for (int i = 0; i < arr.length; i++) {
		
		
		if(arr[i]<min)
		{
			min=arr[i];
			
		}
	}
	
	System.out.println(min);
	
	
	}
	
	
	
}
