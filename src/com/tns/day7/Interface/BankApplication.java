package com.tns.day7.Interface;

public class BankApplication {
	
public static void main(String[] args) {
		
		Bank bank = new BankImplementation();//dynamic 
		Account acc= new Account(107,"supreetha",40000,bank);
		acc.deposit(0);
		System.out.println(acc);//tostring
		acc.withdraw(20000);
		System.out.println(acc);
	
	}

}
