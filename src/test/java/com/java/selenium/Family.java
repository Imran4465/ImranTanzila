package com.java.selenium;

public class Family {
	
	 int h=20; //Instance variable  
	 int y=30;
	
	public  void add() { // non return method
		
		System.out.println(h+y);
	}
	public static void main(String[] args) {
		Family abc = new Family();
		abc.add();
 
		
	}

}
