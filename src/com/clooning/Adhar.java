package com.clooning;

public class Adhar implements Cloneable{
	
	private String adharNo;
	public String getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	public Adhar(String adharNo)
	{
		this.adharNo=adharNo;
	}
	 public Adhar()
	{
		
	}
	@Override
	public String toString() {
		return "Adhar [adharNo=" + adharNo + "]";
	}
	 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
