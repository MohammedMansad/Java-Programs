package com.abc;

public class BubbleSort {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int a[]= {1,22,33,54,87,556,90,6,3,0,3,44,90};
		//int a[]= {2,3,44,55,59,667,54,32,45,978,1,-1,0};
		
		int temp;
		
		for(int i=0;i<a.length;i++)
		{
			
			int flag=0;
			
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" ");
		}
		
		
}
}