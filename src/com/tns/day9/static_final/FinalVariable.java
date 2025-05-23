package com.tns.day9.static_final;

public class FinalVariable {
	final int x=100;
	final static int Y;//declaration but not initialized
	final static int Z=10;
	
	void change() {
		
		x=30;
		Y=100;
	}
	
	@Overrride
	public String toString() {
		return "FinalVariable [x=" + x + " , Y" + Y + "]";
	}
	//Declare a static block to initializethe final static_variable.
	static {
		Y=20;
		Z=100;
		System.out.println("Value  of Y: "+ Y);
	}

}
