package com.singleton;



 class Singletone
 {
private static Singletone  s_instance=null;



private  Singletone() {
	
	
	
}
public static  Singletone getInstance()

{
	
	if(s_instance==null)
	{
		s_instance=new Singletone();
	}
	return s_instance;
	
}
 }
public class SingletoneCLass {
	
	public static void main(String[] args) {
		
		Singletone x=Singletone.getInstance();
		
		Singletone y=Singletone.getInstance();
		
		Singletone z=Singletone.getInstance();
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
		System.out.println(z.hashCode());
		
		
	}

}
