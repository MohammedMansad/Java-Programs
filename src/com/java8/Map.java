package com.java8;

import java.util.ArrayList;
import java.util.List;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s="Mohammed Mansad";
		int length=s.length();
		String rev="";

		for(int i=length-1;i>=0;i--)
		{
		 rev=rev+s.charAt(i);

		}
		System.out.println(rev);


		//remove duplicate values

		char[] arr=rev.toCharArray();
	

		List<Character> unqiueList=new ArrayList<Character>();

		for(char val:arr)
		{
		if(!unqiueList.contains(val)){
		unqiueList.add(val);
		}
		}
		unqiueList.forEach(System.out::print);
		

	}
	

}
