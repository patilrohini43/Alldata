package com.bridgelabz.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CollegeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfigure.class);
		College college=context.getBean("collegeBean",College.class);
		System.out.println("Object is created successfully");
		

	}

}
