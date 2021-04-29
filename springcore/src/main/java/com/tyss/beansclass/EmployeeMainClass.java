package com.tyss.beansclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMainClass {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee=  (Employee)context.getBean("empOne");
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEname());
		
		
		
		Employee employee2 =  (Employee)context.getBean("empTwo");
		System.out.println(employee2.getEmpid());
		System.out.println(employee2.getEname());
	}

}
