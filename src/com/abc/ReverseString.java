package com.abc;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String s="Mansad Ziyad Tafseer";
		String[] split = s.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			
			for(int j=split[i].length()-1;j>=0;j--)
			{
				System.out.print(split[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}

