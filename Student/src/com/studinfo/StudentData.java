package com.studinfo;

public class StudentData {

	static String collegeName;
	int studentId;
	String studentName;
	{
	
	System.out.println("Instance block");
	}
	public static void main(String[] args) {
		StudentData std=new StudentData();
		
        int collegeId=1;
		StudentData.collegeName="SRKR";
		std.studentId=101;
		std.studentName="Yochitha";
//		studentMarks=60;
		System.out.println(" first object");
		System.out.println("College Name : "+collegeName);
		System.out.println("Student Id : "+std.studentId);
		System.out.println("Student Name : "+std.studentName);
//		System.out.println("Student Marks : "+studentMarks);
		System.out.println(collegeId);
		
		System.out.println("Second object ...");
		StudentData std2=new StudentData();
		System.out.println("College Name : "+collegeName);
		System.out.println("Student Id : "+std2.studentId);
		System.out.println("Student Name : "+std2.studentName);
//		System.out.println("Student Marks : "+std2.studentMarks);
		
		std2=null;
		StudentData std3=new StudentData();
		System.gc();
		
		System.out.println(std);
		System.out.println(std2);
		System.out.println(std3);
		
	}

}
