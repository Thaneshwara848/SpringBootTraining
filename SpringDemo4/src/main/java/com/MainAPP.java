package com;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainAPP {
	public static void main(String[] args) {	
		
ApplicationContext context=
	new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1= (Employee)context.getBean("empbean");
		Employee e2= (Employee)context.getBean("empbean");
		Employee e3= (Employee)context.getBean("empbean");
	}
}
