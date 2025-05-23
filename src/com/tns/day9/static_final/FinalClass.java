package com.tns.day9.static_final;

//final cannot be inherited

final class FinalClass 
{
	
	void show() {
		System.out.println("final class cannot be inherited");
	}
	
	final class final3 extends FinalClassDemo {
		
	 //final classes cannot be inherited...
	//	remove the final keyword and check
		
	}
}
//outer class cannot be static
//class can be public , abstract ,