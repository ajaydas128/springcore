package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");
//		Emp emp1=context.getBean("address",Emp.class);
		Emp emp1=(Emp)context.getBean("emp1");
		System.out.println(emp1);
		
		Emp emp2=(Emp)context.getBean("emp2");
		System.out.println(emp2);
	}
}
