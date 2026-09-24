package com.javafundamentals;

class Employee{
	int empId;
	String empName;
	int sal;
}
public class TestMethods2 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId=101;
		e.empName="yochitha";
		e.sal=20000;
       Employee e1=e;
       System.out.println(e1.empId);
       System.out.println(e1.empName);
       System.out.println(e1.sal);
	}

}
