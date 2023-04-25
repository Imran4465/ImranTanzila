package com.java.selenium;

public class JabaNew {

	int number;
	static int age;
	
	void farjana() {
		number=10;
	System.out.println(number);
	}
	
	static void rumana() {
		age=100;
	}
	public static void main(String[] args) {
		JabaNew abc=new JabaNew();
		abc.farjana();
		System.out.println(abc.number);
	}
}
