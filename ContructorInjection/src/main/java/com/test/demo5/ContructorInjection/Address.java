package com.test.demo5.ContructorInjection;

public class Address {

	private String city;
	private String state;
	private String country;
	
	public Address(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public void displayInfo() {
		System.out.println(city+ " "+ state+" "+country);

	}
}
