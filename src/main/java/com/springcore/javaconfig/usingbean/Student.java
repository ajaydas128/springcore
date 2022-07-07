package com.springcore.javaconfig.usingbean;

public class Student {
	private Samosa samosa;
	
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {
		samosa.display();
		System.out.println("Student is studying");
	}
}
