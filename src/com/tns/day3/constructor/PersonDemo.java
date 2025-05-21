package com.tns.day3.constructor;

import java.util.Scanner;

public class PersonDemo {
	
	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the name");
		String name=obj.next();
		System.out.println("enter the income");
		int income=obj.nextInt();
		System.out.println("enter the gender");
		String gender=obj.next();
		System.out.println("enter the age");
		int age=obj.nextInt();
		System.out.println("enter the tax");
		int tax=obj.nextInt();
		
		Person p = new Person();
		p.setAge(age);
		p.setGender(gender);
		p.setIncome(income);
		p.setName(name);
		p.setTax(tax);
		
		System.out.println(p); 		

	}

}
