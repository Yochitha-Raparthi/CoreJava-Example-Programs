package com.javafundamentals;

public class Employee1 {
    void display(int empId,String empName,int empSalary) {
    	System.out.println("Employee Id : "+empId);
    	System.out.println("Employee Name : "+empName);
    	System.out.println("Employee Salary : "+empSalary);
    	}
	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		Employee1 e3=new Employee1();
		System.out.println("Employee 1 Details ...");
		e1.display(101, "manasa", 50000);
		System.out.println("Employee 2 Details ...");
		e1.display(102, "dedeepya", 60000);
		System.out.println("Employee 3 Details ...");
		e1.display(103, "manjula", 70000);
		

	}

}
