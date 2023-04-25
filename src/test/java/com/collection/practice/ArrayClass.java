package com.collection.practice;

public class ArrayClass {
	
		public static void main(String[] args) {
			
			String[] syl = {"Fatema","Hamid","Fatema","Masud","Imran"};
	
			for(int i=0;i<syl.length;i++) {
				for(int j=i+1;j<syl.length;j++) {
					if(syl[i]==syl[j]) {
						System.out.println("Duplicate value:"+syl[i]);
					}
					
					
				}
			}
}
		}