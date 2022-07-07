package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("int, int constructor");
	}
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("double, double constructor");
	}
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String, String constructor");
	}
	
	public void doSum() {
		System.out.println("Value of a "+this.a);
		System.out.println("Value of b "+this.b);
		System.out.println("Sum "+(this.a+this.b));
	}
	
	
}
