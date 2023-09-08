package com.java8;

public class Test  implements Cloneable
{ 
	String name;
	int age;
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		/*
		 aghar hum reference copy kartha hai tho clone object bhi change hotha hai
		 
		 
		Test orginalObje=new Test();
		orginalObje.name="Mansad";
		orginalObje.age=26;
		
		 Test t4=orginalObje;
		
		//System.out.print("Test2 ");
		System.out.println(t4.name+"  "+t4.age);
		
		orginalObje.name="Ziyad";
		orginalObje.age=28;
		
		//System.out.print("Test2 ");
		System.out.println(t4.name+"   "+t4.age);*/
		
		//shallow clonning 

		Test orginalObje=new Test();
		orginalObje.name="Mansad";
		orginalObje.age=26;
		
		System.out.println(orginalObje.name+" "+orginalObje.age);
		
		Test cloneObject = (Test)orginalObje.clone();
		cloneObject.name="Ziyad";
		cloneObject.age=25;
		System.out.println(cloneObject.name+" "+cloneObject.age);
		
		orginalObje.name="Ameer";
		orginalObje.age=30;
		System.out.println(cloneObject.name+" "+cloneObject.age);
		
		
		
		try
		{
		//cloning the object
		//Test t2 = (Test) t.clone();
		//System.out.print("Test2 ");
		//System.out.println(t2.name+""+t2.age);
		
		//t2.name="Ziyad";
		//t2.age=30;
		//System.out.print("Test2 Clone change ");
		//System.out.println(t2.name+""+t2.age);
		
		//t.name="Manshad";
		//t.age=26; 
		
		//System.out.print("Test1 ");
		//System.out.println(t.name+""+t.age);
		
	//	System.out.print("Test2 ");
		//System.out.println(t2.name+""+t2.age);
		/*
		Test t3 = (Test)t.clone();
		
		t3.name="Mehroof";
		t3.age=24;
		System.out.println(t3.name);
		System.out.println(t3.age);
		
		Test t4 = (Test)t3.clone();
		t4.name="Paju";
		t4.age=33;
		System.out.println(t4.name);
		System.out.println(t4.age);
		*/
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
	
