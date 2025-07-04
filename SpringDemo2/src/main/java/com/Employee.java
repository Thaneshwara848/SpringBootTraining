package com;

import java.util.ArrayList;
import java.util.HashSet;

public class Employee {
	
	private int uid;
	private String name;
	private String city;
	private int ph;
	private String hobis[];
	private ArrayList emails;
	private HashSet pan;
	// setter 
//	toString 
//	display
	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", name=" + name + ", city=" + city + ", ph=" + ph + "]";
	}
	void display() {
		System.out.println("ID :"+ uid);
		System.out.println("name :"+name);
		System.out.println("City L"+ city);
		System.out.println("Phone :"+ ph);
	}
	
	public HashSet getPan() {
		return pan;
	}
	public void setPan(HashSet pan) {
		this.pan = pan;
	}
	public ArrayList getEmails() {
		return emails;
	}
	public void setEmails(ArrayList emails) {
		this.emails = emails;
	}
	public String[] getHobis() {
		return hobis;
	}
	public void setHobis(String[] hobis) {
		this.hobis = hobis;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPh() {
		return ph;
	}
	public void setPh(int ph) {
		this.ph = ph;
	}
	
}
