package com.javafundamentals;

public class TestMethods {
	
    static void add(int a,int b) {
    	int sum=a+b;
    	System.out.println("Addition of two numbers: "+sum);
    	subtract(sum,5);
    }
    
    static void subtract(int a,int b) {
    	int diff= a-b;
    	System.out.println("subtraction of two numbers: "+diff);
    	multiply(diff,10);
    }
    
    static void multiply(int a,int b) {
    	int prod= a*b;
    	System.out.println("multiplication of two numbers: "+prod);
    	division(prod,5);
    }
    
    static void division(int a,int b) {
    	int div=a/b;
    	System.out.println("division of two numbers: "+div);
    }
	public static void main(String[] args) {
		add(10,20);
	}

}
