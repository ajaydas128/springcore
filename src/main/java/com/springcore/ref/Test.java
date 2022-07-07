package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		B bObj=(B)context.getBean("bref");
		System.out.println(bObj);
		A aObj=(A)context.getBean("aref");
		System.out.println(aObj);
	}

}
