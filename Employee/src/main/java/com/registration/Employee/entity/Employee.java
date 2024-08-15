package com.registration.Employee.entity;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String Name;
	private String Email;
	private String Address;
	
	public Employee(String name, String email, String address) {
		super();
		Name = name;
		Email = email;
		Address = address;
	}
	
	public Employee(int id, String name, String email, String address) {
		super();
		this.id = id;
		Name = name;
		Email = email;
		Address = address;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", Email=" + Email + ", Address=" + Address + "]";
	}
	
	
	
	

}
