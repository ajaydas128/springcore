package com.springcore.auto.wire.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
//	@Qualifier("temp1")
	@Qualifier("temp1")
	private Address address;

	public Address getAddress() {
		return address;
	}
//	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Inside setAddress");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Emp constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
}
