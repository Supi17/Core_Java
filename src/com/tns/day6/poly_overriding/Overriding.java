package com.tns.day6.poly_overriding;

public class Overriding {
	
	public static void main(String[] args) {
		
		//also an example of hierarchial inheritance
		
		RBI rbi;
		rbi=new SBI();
		System.out.println(rbi.getRateofIntrest());
		rbi=new HDFC();
		System.out.println(rbi.getRateofIntrest());
		rbi=new ICIC();
		System.out.println(rbi.getRateofIntrest());
	}

}
