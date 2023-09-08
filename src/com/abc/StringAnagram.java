package com.abc;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

	
	public static void main(String[] args) {
	
		 
		
		String  s="Mansad";
		Map<Character, Integer>mp=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(!mp.containsKey(s.charAt(i)))
			{
				mp.put(s.charAt(i), 1);
			}
			else 
			{
				Integer integer = mp.get(s.charAt(i));
				mp.put(s.charAt(i),++integer);
			}
		}
		
		//System.out.println(mp);
		
		
		for (Map.Entry<Character, Integer> string : mp.entrySet())
		{
			Character  keyvalues = string.getKey();
			Integer value = string.getValue();
			if(value==1) 
			{
			System.out.print(keyvalues);
			}
		}
		 
	} 

}
