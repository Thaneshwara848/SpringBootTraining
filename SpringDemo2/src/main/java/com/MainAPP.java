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
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e= (Employee)context.getBean("empbean");
		System.out.println(e);
		e.display();
		
		System.out.println("============= Array =======");
		String hbs[]=e.getHobis();
		for(String hobis:hbs) {
			System.out.println(hobis);
		}
		
		System.out.println("=============== ArrayListy=======");
		ArrayList em=e.getEmails();
		Iterator i =em.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("=============== HashSet=======");
		HashSet pans=e.getPan();
		Iterator i1 =pans.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	
	}
}
