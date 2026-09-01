package com.studinfo;

public class Institute {

	static String trainerName1;
	static String trainerName2;
	int empId=106;
	String empName="Deekshi";
	String empDesignation="QA Developer";
	public static void main(String[] args) {
		trainerName1="Vishwanath Sir";
		trainerName2="Srikanth Sir";
		System.out.println("Employee 1 Information ....");
		Institute i1=new Institute();
		i1.empId=101;
		i1.empName="Teja";
		i1.empDesignation="Python Developer";
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i1.empId);
		System.out.println(" Employee Name : "+i1.empName);
		System.out.println(" Employee Designation : "+i1.empDesignation);
		
		System.out.println("\nEmployee 2 Information ....");
		Institute i2=new Institute();
		i2.empId=102;
		i2.empName="Naveen";
		i2.empDesignation="Java Developer";
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i2.empId);
		System.out.println(" Employee Name : "+i2.empName);
		System.out.println(" Employee Designation : "+i2.empDesignation);
		
		System.out.println("\nEmployee 3 Information ....");
		Institute i3=new Institute();
		i3.empId=103;
		i3.empName="Uma";
		i3.empDesignation="AIML Engineer";
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i3.empId);
		System.out.println(" Employee Name : "+i3.empName);
		System.out.println(" Employee Designation : "+i3.empDesignation);
		
		
		System.out.println("\nEmployee 4 Information ....");
		Institute i4=new Institute();
		i4.empId=104;
		i4.empName="Pavan";
		i4.empDesignation="Analyst";
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i4.empId);
		System.out.println(" Employee Name : "+i4.empName);
		System.out.println(" Employee Designation : "+i4.empDesignation);
		
		System.out.println("\nEmployee 5 Information ....");
		Institute i5=new Institute();
		i5.empId=105;
		i5.empName="Vyshu";
		i5.empDesignation="AI Engineer";
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i5.empId);
		System.out.println(" Employee Name : "+i5.empName);
		System.out.println(" Employee Designation : "+i5.empDesignation);
		
		System.out.println("\nEmployee 6 Information ....");
		Institute i6=new Institute();
		System.out.println("1st Trainer Name : "+trainerName1);
		System.out.println("2nd Trainer Name : "+trainerName2);
		System.out.println(" Employee Id : "+i6.empId);
		System.out.println(" Employee Name : "+i6.empName);
		System.out.println(" Employee Designation : "+i6.empDesignation);
	}

}
