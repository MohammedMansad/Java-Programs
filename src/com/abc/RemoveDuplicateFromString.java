package com.abc;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		String s="Mansadmnd";
		String[] split = s.split("");
		
		Set<String>set=new HashSet<>();
		for (int i = 0; i < split.length; i++) {
			
			set.add(split[i]);

		} 
		System.out.println(set);
		
	}

}
