package com.abc;

import java.util.ArrayList;
import java.util.Iterator;

public class Students {

	public static void main(String[] args)
	{
		
		
		ArrayList< Integer>al=new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		Iterator<Integer>itr=al.iterator();
		
		while(itr.hasNext())
		{
			Integer next = itr.next();
			
			if(next.equals(3))
			{
			al.remove(next);
			}
		}
		
	}

	
}
