package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person per=(Person)context.getBean("person");
		System.out.println(per);
		
		Addition add=(Addition)context.getBean("addition");
		add.doSum();
	}

}
