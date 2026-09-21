package com.javafundamentals;

public class BugTracker {

	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	int priority;
	String status;
	String assignedDeveloper;
	int getBugId() {
		return bugId;
	}
	String getBugTitle() {
		return bugTitle;
	}
	String getApplicationName() {
		return applicationName;
	}
	String getSeverity() {
		return severity;
	}
	int getPriority() {
		return priority;
	}
	String getStatus() {
		return status;
	}
	String getAssignedDeveloper() {
		return assignedDeveloper;
	}
	void assignToDeveloper(int id,String developer) {
	if(bugId==id) {
		assignedDeveloper=developer;
	System.out.println("bug id is "+getBugId()+" developer name is "+getAssignedDeveloper());
	updateStatus("In development");
	}else {
		System.out.println("bug is not found");
	}
		
	}
	void updateStatus(String newStatus) {
		status=newStatus;
	}
	void displayBugSummary() {
		System.out.println("Bug id is : "+getBugId());
		System.out.println("Bug Title is : "+getBugTitle());
		System.out.println("Application name is : "+getApplicationName());
		System.out.println("Developer name is : "+getAssignedDeveloper());
		System.out.println("Severity of the bug : "+getSeverity());
		System.out.println("Priority to solve the bug : "+getPriority());
		System.out.println("status of the bug : "+getStatus());
		System.out.println("bug is assigned to the developer");
		assignToDeveloper(bugId,assignedDeveloper);	
		System.out.println("status of the bug : "+status);
	}
	public static void main(String[] args) {
		BugTracker bg=new BugTracker();
		bg.bugId=101;
		bg.bugTitle="string out of bounds";
		bg.applicationName="Spring boot application";
		bg.severity="moderate";
		bg.priority=1;
        bg.status="Not started";
        bg.assignedDeveloper="ramesh";
        bg.displayBugSummary();
//        bg.assignedDeveloper="suresh";
        bg.assignToDeveloper(101,"suresh");
//        bg.displayBugSummary();
        System.out.println(bg.status);
        bg.assignToDeveloper(102,"raju");
	}

}
