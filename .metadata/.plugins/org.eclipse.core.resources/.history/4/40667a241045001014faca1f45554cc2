package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class MainAPP {
	public static void main(String[] args) {	
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e= (Employee)context.getBean("empbean");
		System.out.println(e);
		e.display();
	}
}
