package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{	
		//tight coupling
		//		Student s1=new Student();
		//		s1.setStudentId(1);
		//		s1.setStudentName("Vijay");
		//		s1.setStudentAddress("Dubai");
		//		System.out.println( s1);
		
		//loose coupling
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student1=(Student)context.getBean("student1");
		System.out.println(student1);
		Student student2=(Student)context.getBean("student2");
		System.out.println(student2);
		Student student3=(Student)context.getBean("student3");
		System.out.println(student3);
	}
}
