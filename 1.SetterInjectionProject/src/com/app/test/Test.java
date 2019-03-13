package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.EmployeeBean;

public class Test {

	public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
EmployeeBean employeeBean1=(EmployeeBean)ac.getBean("employeeBean");
System.out.println(employeeBean1);
	}

}
