package com.studinfo;

public class Student {

	static int classId;
	static String className;
//	int studId;
//	String studName;
	int studId=99;
	String studName="teja";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classId=101;
		className="forth";
		Student s1=new Student();
		s1.studId=1;
		s1.studName="yochitha";
	    System.out.println("Student 1 details ....");
	    System.out.println("class Id :"+classId);
	    System.out.println("class name : "+className);
	    System.out.println("Student Id :"+s1.studId);
	    System.out.println("Student Name : "+s1.studName);  
	    
	    Student s2=new Student();
		
	    System.out.println("Student 2"
	    		+ " details ....");
	    System.out.println("class Id :"+classId);
	    System.out.println("class name : "+className);
	    System.out.println("Student Id :"+s2.studId);
	    System.out.println("Student Name : "+s2.studName);  
	}
}
