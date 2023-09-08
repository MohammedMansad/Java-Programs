package com.clooning;

public class Main   {


	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		Employee employeeOriginal=new Employee();
		employeeOriginal.setId(101);
		employeeOriginal.setName("Tafseer");
		Adhar adharOriginal=new Adhar();
		adharOriginal.setAdharNo("124353567687");
		employeeOriginal.setAdhar(adharOriginal);
		
		System.out.println(employeeOriginal);
		
		Employee clone =(Employee)employeeOriginal.clone();
		System.out.println("Clone Obj   "+clone);
	/* changing in clone object on impact	
		clone.setName("ziayd");
		Adhar adharClone=new Adhar();
		adharClone.setAdharNo("12244354");
		clone.setAdhar(adharClone);
		System.out.println("Clone Obj after change  "+clone);*/

		//clone.setName("Manshad");;
		employeeOriginal.getAdhar().setAdharNo("66767");
		
		
		System.out.println("Orginal Obj"+employeeOriginal);
		System.out.println("Clone Obj   "+clone);
		
	
		
		

	}

}
