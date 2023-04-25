package com.collection.practice;

public class BreakContinueStatements {

	
	public static void continuePractice() {
		
		for(int i =0; i<100;i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		BreakContinueStatements.continuePractice();
	}
}
