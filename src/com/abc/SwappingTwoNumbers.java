package com.abc;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapping two numbers without using third variable.
		
		int x=3;
		int y=2;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping the number is:"+"x="+x +"y="+y);
	}
 
}
