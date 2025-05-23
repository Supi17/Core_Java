package com.tns.day9.static_final;

public class Final2 extends FinalMethodClass
{
	//final methods cannot be overridden ..gives CTE
		//subclass to prove that final methods cannot be overrideen
		void show() {
			
			System.out.println("the value is b");
		}

}
//final methods cannot be overridden , re inherited 