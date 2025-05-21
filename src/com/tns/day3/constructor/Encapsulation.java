package com.tns.day3.constructor;

public class Encapsulation {
	
	public static void main(String[] args) {
		EncapsulationExample obj = new EncapsulationExample();
		obj.setAge(20);
		obj.setName("supreetha");
		obj.setSerialNum(100);
		
		obj.getAge();
		obj.getName();
		obj.getSerialNum();
		
		System.out.println(obj);
		
		

		}

}
