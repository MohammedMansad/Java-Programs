package com.abc;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {34,44,99,654,990,9043};
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		
		
	
	}
	
	

}
