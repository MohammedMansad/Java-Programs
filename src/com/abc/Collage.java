package com.abc;


 class CollageJR extends Collage {
	int num=10;
	 public String getCollageName() {
			
			return "Bunts JR College";
		}
	 
	 public int getFees(String division) {
			switch (division) {
			case "12": 	return 500;
			case "11": return 200;
			default:
				throw new IllegalArgumentException("Unexpected value: " + division);
			}
		
}
	 public int getTotalStudentByDivision(String division) {
			
			switch (division) {
			case "IT": 	return 300;
			case "BMS": return 400;
			case "CA": 	return 400;
			default:
				throw new IllegalArgumentException("Unexpected value: " + division);
			}
		}
 }
public class Collage {


	

	public String getCollageName() {
		
		return "Bunts College Degeer";
	}
	public int getFees(String division) {
		switch (division) {
		case "IT": 	return 100;
		case "BMS": return 200;
		case "CA": 	return 400;
		default:
			throw new IllegalArgumentException("Unexpected value: " + division);
		}
		
	}
	//5
	
	
	public static void main(String[] args) {
	Collage c=new Collage();
	System.out.println(	c.getCollageName());
	System.out.println(	c.getFees("IT"));

	
	
	Collage c1=new CollageJR();
	System.out.println(	c1.getCollageName());
	System.out.println(	c1.getFees("12"));
	//System.out.println(c1.getTotalStudentByDivision("IT"));
	}
	
}
