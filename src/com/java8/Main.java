package com.java8;

public class Main implements MyInter {

	public static void main(String[] args) {
		
		MyInter inter=new Main();
		inter.sayHello(1, "manshad");
	 
	}

	@Override
	public int sayHello(int num, String name) {
		System.out.println(num+"  "+name);
		return 0;
	}

}
