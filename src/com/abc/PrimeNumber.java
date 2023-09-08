package com.abc;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int no=2;
		//for checking the prime number logic starts from 2  the no-1.
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(" Not Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}

	}

}
