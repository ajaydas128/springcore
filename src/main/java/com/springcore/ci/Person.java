package com.springcore.ci;

public class Person {
	private String name;
	private int persionId;
	private Certificate certi;
	public Person(String name, int persionId, Certificate certi) {
		this.name = name;
		this.persionId = persionId;
		this.certi=certi;
		System.out.println("Person Constructor");
	}
	@Override
	public String toString() {
		return this.name+" : "+this.persionId +" : "+this.certi;
	}
	
	
	
	
}
