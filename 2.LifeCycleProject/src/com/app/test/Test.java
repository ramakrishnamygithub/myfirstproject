package com.app.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class Test {

	public static void main(String[] args) {
	AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
	Employee employee =(Employee)ac.getBean("employee");
	System.out.println(employee);
	ac.registerShutdownHook();

	}

}
