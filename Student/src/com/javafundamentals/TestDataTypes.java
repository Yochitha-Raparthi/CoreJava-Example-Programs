package com.javafundamentals;

public class TestDataTypes {
	short empId;
	String empName;
	byte empAge;
	int empSalary;
	int empGrade;
	byte empExp;
	boolean empActive;
	int empLeaves;
	long phno;
	void applyLeave(int empLeave,int leaves ) {
		empLeaves-=leaves;
		System.out.println(" Employee Leaves : "+empLeaves);
	}
	void display() {
		System.out.println(" Employee Id : "+empId);
		System.out.println(" Employee Name : "+empName);
		System.out.println(" Employee Age : "+empAge);
		System.out.println(" Employee Salary : "+empSalary);
		System.out.println(" Employee Grade : "+empGrade);
		System.out.println(" Employee Experience : "+empExp);
		System.out.println(" Employee Active : "+empActive);
		System.out.println(" Employee Leaves : "+empLeaves);
		System.out.println(" Employee phone number: "+phno);
		
	}
	public static void main(String[] args) {
		TestDataTypes t=new TestDataTypes();
		System.out.println("Employee 1 details ....");
		t.empLeaves=20;
		t.empId=1002;
		t.empAge=17;
		t.empSalary=100000;
		t.empGrade=1;
		t.empExp=1;
		t.empActive=true;
		t.empLeaves=20;
		t.phno=8989895895L;
		t.display();
		int leaves=3;
		t.applyLeave(t.empLeaves,leaves);
		
	}

}
