package com.clooning;

public class Employee implements Cloneable{
	
	private String  name;
	private int id;
	private  Adhar adhar;
	//private List<Adhar> adharlist; when employee has multiple  Adhar card then use the list it is called one to  many ampping.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Adhar getAdhar() {
		return adhar;
	}
	public void setAdhar(Adhar adhar) {
		this.adhar = adhar;
	}
	public Employee(String name, int id, Adhar adhar) {
		super();
		this.name = name;
		this.id = id;
		this.adhar = adhar;
	}
	public Employee()
	{
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", adhar=" + adhar + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employee employee = (Employee) super.clone();
		employee.setAdhar((Adhar) employee.getAdhar().clone());
		return employee;
	}

	

}
