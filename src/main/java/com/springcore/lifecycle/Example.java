package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject=subject;
	}
	public Example() {
		super();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Example of init using @Postconstruct");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Example of destroy using @Predestroy");
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
}
