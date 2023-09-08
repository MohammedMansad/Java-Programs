package com.abc;

public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String a[]= {"Manchu","Ziyad","Ameer","Tafseer","Muajjim","lok"};
	for (int i = 0; i < a.length; i++) {
		String temp;
		for (int j = 0; j < a.length-1; j++)
		{
			
			if(a[j].compareTo(a[j+1])>0)
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		} 
		
		 
	}
	for (int i = 0; i < a.length; i++) {
		
		System.out.println(a[i]+" ");
	}

	}
	

}
