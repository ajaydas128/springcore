package com.springcore.javaconfig.usingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
//		Student student=context.getBean("getStudent",Student.class);
//		student.study();
		
		Student student2=context.getBean("con",Student.class);
		student2.study();
	}

}
