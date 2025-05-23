package com.tns.day9.static_final;

public class FinalMethodClass {
	FinalMethodClass(){
		
		System.out.println("this is a default constructor");
	}

	final int a=10;//initialized and cannot be re-assigned
	
	//final method
	final void show() {
		System.out.println("the value of a is "+a);
	}


}
