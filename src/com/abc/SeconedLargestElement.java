package com.abc;

public class SeconedLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={40,1,2,34,5,36,38,38};
		int max=a[0];
		int sMax=0;
		
		for(int i=0;i<a.length;i++)   
		{
		if(a[i]>max)
		{
			sMax=max;
			max=a[i]; 
		}
		
		else if(a[i]>sMax  &&  max!=a[i])  
		
		{

			sMax=a[i];
			
		}
		
	}
		System.out.println(max);
		System.out.println(sMax);
		
		
		
}
}