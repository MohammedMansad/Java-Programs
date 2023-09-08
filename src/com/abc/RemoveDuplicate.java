package com.abc;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void removeDuplicat(int a[])
	{
		HashSet<Integer>set=new HashSet<>();
		for(int i=0;i<a.length;i++)
			set.add(a[i]);
		System.out.println(set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,12,45,67,88,77,99,90,77,2,45,34,77,77,77,77,77,777};
		removeDuplicat(a);
		
	}

}
