package com.springcore.javaconfig.usingbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")		//There is no need of this as we are not using @Component annotation
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		return samosa;
	}
	
	@Bean(name = {"student","stud","con"})
	public Student getStudent() {
		Student student=new Student(getSamosa());
		return student;
	}
}
