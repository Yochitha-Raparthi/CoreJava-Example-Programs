package com.javafundamentals;

public class Employee2 {
	int empId;
	String ename;
	double esal;
	Employee2(int empId,String ename,double esal){
		this.empId=empId;
		this.ename=ename;
		this.esal=esal;
	}
	void display() {
		System.out.println("Employee id : "+empId);
		System.out.println("Employee name : "+ename);
		System.out.println("Employee sal : "+esal);
	}
	public static void main(String[] args) {
		
		Employee2 e=new Employee2(1,"yochi",100000);
		e.display();

	}

}
