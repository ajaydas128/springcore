package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
//		Person per=context.getBean("person",Person.class);
//		System.out.println(per);
		Person per=context.getBean("obj",Person.class);
		System.out.println(per);
	}

}
