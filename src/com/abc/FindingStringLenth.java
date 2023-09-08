package com.abc;

import java.util.ArrayList;

public class FindingStringLenth {
	public static void main(String[] args)
	 {
		
		ArrayList<String>al=new ArrayList<>();
		al.add("Tafseer");
		al.add("ziyad");
		al.add("Mansad");
		al.add("Ameer");
		for(int i=0;i<al.size();i++)
		{
			String string = al.get(i);
			int length = string.length();
			System.out.println(length);
		
		}
		
	
		
		
	}

}
