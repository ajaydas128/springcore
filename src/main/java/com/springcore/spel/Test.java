package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/spel/config.xml");
		Demo demo1=context.getBean("demo",Demo.class);
		System.out.println(demo1);
		
		
		
		
		
		
//		Demo demo2=context.getBean("demo",Demo.class);
//		System.out.println(demo2);
//		
//		if(demo1.hashCode()==demo2.hashCode()) {
//			System.out.println("same objects");
//		}
//		else {
//			System.out.println("different objects");
//		}
	}

}
