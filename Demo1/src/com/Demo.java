package com;
class A
{
	String name1=new String("Thanesh");
	String name2=new String("Thanesh");
	
	A(){
		System.out.println(name1==name2);				// false
		System.out.println(name1.equals(name2));
	}
}
public class Demo {

	public static void main(String[] args) {
	
			A a1 = new A();
			A a2 = new A();
			
			System.out.println(a1==a2);
			System.out.println(a1.hashCode());
			System.out.println(a2.hashCode());
			
	}
}
