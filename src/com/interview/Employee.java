package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Employee   implements  Comparable<Employee> {
	
	private int  id;
	private  String name;
	private  int salary;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	
	  @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		
		  
		  
		  Employee  e1 =new Employee(1,"tom",1000);
		  Employee  e2 =new Employee(2,"bob",2000);
		  Employee  e3 =new Employee(3,"jack",3000);
		  
		  
		  ArrayList<Employee>emp=new  ArrayList<>();
		  emp.add(e2);
		  emp.add(e1);
		  emp.add(e3);
		  
		  
		  
		  
		  emp.forEach(System.out::println);
		  
		 Collections.sort(emp);
		 emp.forEach(System.out::println);
		  
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return  this.name.compareTo(o.name);
	}
	

}
