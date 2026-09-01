package com.studinfo;

public class StudentDetails {

	public static void main(String[] args) throws ClassNotFoundException{
	   System.out.println("Execution start");
       System.out.println("Student Information");
     
       Class.forName("java.lang.String");
       Class.forName("java.lang.System");
       Class.forName("com.studinfo.StudentDetails");
       Class.forName("com.mysql.cj.jdbc.Driver");
       
       System.out.println("Execution ended");
       
	}

}