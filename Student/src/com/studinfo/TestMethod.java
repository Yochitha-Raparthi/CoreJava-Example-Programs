package com.studinfo;

public class TestMethod {
	static void display() {
//		t.details();
		System.out.println("Static method 1");
//		t.add();
	}
	void add(){
		int a=3;int b=5;
		int c=a+b;
		System.out.println("Sum is : "+c);
	}
	static void display2() {
		
		System.out.println("Static method 2");
	}
	void details() {
		System.out.println("All method details are : ");
	}
	static {
		new TestMethod();
		display();
		display2();
	}
	{
		details();
	    add(); 
	}
	public static void main(String[] args) {
//		TestMethod t=new TestMethod();
//        t.details();
//		display2();
	}

}
