package com.demo;

public class Employee {

	private String firstname;
	public Employee(String firstname, String lastname, String salary) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	private String lastname ;
	
	private String salary;
	private int id;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}
