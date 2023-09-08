package com.abc;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1,"mansad");
		hm.put(2,"sabbu");
		hm.put(3,"musthafa");
	
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+" nm"+m.getValue());
		}
		*/
		
		
		 
		 //ing for each loop
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1,"mansad");
		hm.put(2,"sabbu");
		hm.put(3,"musthafa");
		hm.forEach((key, value)->System.out.println(key+ " "+value));
	
		
/*    using iterator
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1,"mansad");
		hm.put(2,"sabbu");
		hm.put(3,"musthafa");
		Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Integer, String> next = iterator.next();
			
			System.out.println(next.getKey()+""+next.getValue());
		}
		
		
		*/
	}

}
