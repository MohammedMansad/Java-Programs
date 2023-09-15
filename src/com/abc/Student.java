package com.abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>al=new ArrayList<>();
		al.add("manchu");
		al.add("ziyad");
		al.add("ziya");
//		Iterator<String>itr=al.iterator();
//		while(itr.hasNext()) {
//			
//		System.out.println(itr.next());
//		} 
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		

	}

}
