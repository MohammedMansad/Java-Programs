package com.abc;

public class SecondLargest {

	public static void main(String[] args) {
		
		
	int a[]= {2,4,5,90,78,6,99,100};
	
	int temp;
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for (int i = 0; i < a.length-1; i++) {
		
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("The second Largest Element is"+a[1]);
	
	
	
	}
 
}
