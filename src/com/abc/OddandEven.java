package com.abc;

public class OddandEven {

	public static void main(String[] args) {

		int a[]= {35,35,1,2,23,4,5,10,0};
		System.out.println("Odd numbers");
		
		for (int i = 0; i < a.length; i++) {
			
			
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
				
			}
			
		}
		System.out.println("Even Numbers");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
			
		
	}

}
