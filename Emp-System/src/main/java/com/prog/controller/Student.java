package com.prog.controller;

public class Student {
	private String FirstName;
	private String LastName;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}
	public String getFirstName() {
		return FirstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	

}
