package com.javafundamentals;

public class CountObject {

	static int cnt;
	CountObject(){
		cnt++;
	}
	public static void main(String[] args) {
		CountObject c1=new CountObject();
		CountObject c2=new CountObject();
		CountObject c3=new CountObject();
		CountObject c4=new CountObject();
        System.out.println("No of objects created : "+cnt);	
        }

}
