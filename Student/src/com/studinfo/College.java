package com.studinfo;

public class College {
//    void display(String name,int age,String college) {
//    	System.out.println("Name is : "+name);
//    	System.out.println("Age is : "+age);
//    	System.out.println("College is : "+college);
//    	}
	String name;
	int age;
	String college;
	void display() {
    	System.out.println("Name is : "+name);
    	System.out.println("Age is : "+age);
    	System.out.println("College is : "+college);
    	}
	public static void main(String[] args) {
		College c=new College();
//		c.display("teja", 17, "srkr");
		c.name="teja";
		c.age=17;
		c.college="polycet";
		c.display();

	}

}
