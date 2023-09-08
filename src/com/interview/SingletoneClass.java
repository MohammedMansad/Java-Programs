package com.interview;


class  Singletone
{
	
	private static Singletone  s_instance=null;
	Singletone()
	{
		
	}
	public static Singletone  getInstance()
	{
		if(s_instance==null)
		{
			s_instance=new Singletone();
		}
		return s_instance;
		
	}
}
public class SingletoneClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singletone  x= Singletone.getInstance();
		
		
		Singletone y=Singletone.getInstance();
		
		Singletone z=Singletone.getInstance();
		
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());

	}

}
