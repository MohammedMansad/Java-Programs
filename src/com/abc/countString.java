package com.abc;

public class countString {
	public static void main(String[] args) {
		
		String s="mansad";
		int length = s.length();
		String rev="";
		for(int i=length-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("Paliandrome");
		}
		else
		{
			System.out.println("Not Paliandrome");
		}
	}
	}


