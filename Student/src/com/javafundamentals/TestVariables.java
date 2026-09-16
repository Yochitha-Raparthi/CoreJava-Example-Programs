package com.javafundamentals;

public class TestVariables {

	static String name;
	
	int id=40;
	static void sum(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		TestVariables t=new TestVariables();
		int id;
		id=10;
		System.out.println("Local : "+id);
		id=20;
		System.out.println("instance : "+t.id);
		int x=5,y=0;
        sum(x,y);
	}

}
