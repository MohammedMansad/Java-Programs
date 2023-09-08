package com.java8;

import java.util.ArrayList;

public class Collecction {

	public static void main(String[] args) {
		
		
		
	ArrayList<Integer>list=new  ArrayList<>();
	list.add(1);
	list.add(23);
	list.add(66);
	list.add(90);
	list.add(99);
	list.add(67);
	
	
	//iterating list list through for each using lambda
	
	//list.forEach(x->System.out.println(x));
	
	//this is my last try
	list.forEach(System.out::println);	
	
		 

	}

}
