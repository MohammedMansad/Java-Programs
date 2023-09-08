package com.java8;

public class Test4 {
	
	public static void main(String[] args) 
	{
		
		 String s="Mty  name  i skhan";
		 String str = s.toLowerCase();
		 int vcount=0;
		 for(int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)=='a'  || str.charAt(i)=='e'  || str.charAt(i)=='i'  || str.charAt(i)=='o'  ||  str.charAt(i)=='u')
			 {
				 vcount++;
			 }
		 }
		 System.out.println(vcount);
		
	}
		
}





