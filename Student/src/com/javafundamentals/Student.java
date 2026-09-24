package com.javafundamentals;

public class Student {
    int stdno;
    String stdname;
	Student(){
		stdno=106;
		stdname="naveen";
	}
	{
		stdno=105;
		stdname="teja";
	}
	Student(int stdno,String stdname){
		this.stdno=stdno;
		this.stdname=stdname;
	}
	void display() {
		System.out.println(stdno);
		System.out.println(stdname);
	}
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student(1,"yochi");
		s.display();
		s1.display();
		
	}

}
