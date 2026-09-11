package com.javafundamentals;

public class EMPLOYEE {
	short emp_id;
	byte emp_age;
	int salary;
	byte emp_grade;
	byte yoe;
	byte emp_active;
	short no_of_av_leaves;
	long ph_no;
	void applyleaves(EMPLOYEE e1,int num)
	{
		e1.no_of_av_leaves-=num;
		System.out.println("Leaves available now are: "+e1.no_of_av_leaves);
	}
	public static void main(String[] args) {
		EMPLOYEE e1=new EMPLOYEE();
		e1.emp_id=10196;
		e1.emp_age=21;
		e1.salary=600000;
		e1.emp_grade=1;
		e1.yoe=1;
		e1.emp_active=1;
		e1.no_of_av_leaves=20;
		e1.ph_no=9381917398L;
		System.out.println("Employee Details: "+"\n"+
		"ID: "+e1.emp_id+"\n"+
		"Age: "+e1.emp_age+"\n"+
		"Salary: "+e1.salary+"\n"+
		"Grade: "+e1.emp_grade+"\n"+
		"Years of Experience: "+e1.yoe+"\n"+
		"Status: "+e1.emp_active+"\n"+
		"Available Leaves: "+e1.no_of_av_leaves+"\n"+
		"Phone number: "+e1.ph_no);
		e1.applyleaves(e1,3);
		
	}

}
