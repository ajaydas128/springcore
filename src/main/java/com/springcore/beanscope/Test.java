package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/beanscope/config.xml");
//		Person per=context.getBean("person",Person.class);
//		System.out.println(per);
		Person per=context.getBean("person",Person.class);
		Person per2=context.getBean("person",Person.class);
		
		if(per.hashCode()==per2.hashCode()) {
			System.out.println("Singleton bean scope means only one object is created");
		}
		else {
			System.out.println("Prototype bean scope means each time new object is created");
		}
		
	}

}
