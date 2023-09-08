package com.abc;

import java.util.HashSet;

public class Test   
	{
	
	
	public static void main(String args[])
	    {
	    	
		String s="Mohammed Mansad";
		int length = s.length();
		String rev="";
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		String[] split = rev.split("");
	
		HashSet<String>set=new HashSet<>();
		for (int i = 0; i < split.length; i++) {
			
			set.add(split[i]);
		}
		
		System.out.println(set);
	}
}
