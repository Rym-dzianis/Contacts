package com.epam.rymasheuski.springboot.rest.web.services;

public class Contact {
	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int value) {
		this.id = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String value) {
		this.address = value;
	}
}
