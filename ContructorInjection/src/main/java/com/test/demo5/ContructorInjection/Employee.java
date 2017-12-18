package com.test.demo5.ContructorInjection;

public class Employee {

	private String name;
	private int id;
	Address address;
	
	public Employee() {
		System.out.println("default constructor");
	}
	
	public Employee(int id) {
		this.id=id;
	}
	
	public Employee(String name) {
		this.name=name;
	}
	

	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	public void displayEmpInfo() {
		System.out.println("name: "+name+ " ID: "+id);
		address.displayInfo();
	}
	
}
