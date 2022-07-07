package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
//		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		context.registerShutdownHook();
		Samosa s1=(Samosa)context.getBean("samosa1");
		System.out.println(s1);
//		context.registerShutdownHook();
		
		Pepsi p1=(Pepsi)context.getBean("pepsi1");
		System.out.println(p1);
		
		Example e1=(Example)context.getBean("example1");
		System.out.println(e1);
		
		
		
	}
}
