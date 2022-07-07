package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean {
	private int Price;

	public Pepsi(int price) {
		super();
		Price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [Price=" + Price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is init() method");
	}
	
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("This is destroy() method");
	}

	
	
	
}
