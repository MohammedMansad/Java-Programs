package com.interview;

interface  A
{
	  default void show()
	  {
	  System.out.println("Hello");
	  }
  
}
 interface B
  {
  
	  default void show()
	  {
		System.out.println("Hello2");
	  
	  }
  }
 public class Test implements A,B
 {
	
	public static void main(String[] args) 
	{
	
	
		A a=new Test();
		a.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		A.super.show();
	}

}
 

