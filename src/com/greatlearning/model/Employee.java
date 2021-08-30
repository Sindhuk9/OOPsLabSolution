package com.greatlearning.model;

public class Employee {
	
	private String FirstName;
	private String LastName;
	private int Department;

	public Employee(String FirstName,String LastName,int Department)
	{
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Department = Department;
	}	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getDepartment() {
		return Department;
	}
	public void setDepartment(int department) {
		Department = department;
	}
	
}
