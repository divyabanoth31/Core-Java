package com.javaintro;

public class BugTracker {
	
    int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;
	
	int getbugId() {
		return bugId;
	}
	
	String getapplicationName() {
		return applicationName;
		
	}
	
	String getbugTitle() {
		return applicationName;
		
	}
	
	String getseverity() {
		return applicationName;
	}
	
	String getpriority() {
		return applicationName;	
	}
	
	String getstatus() {
		return status;
	}
	
	void getassignedDeveloper () {
		return;	
	}
	
	void assignToDeveloper(int bugid, String developername){
		assignedDeveloper = developername;
		bugId = bugid;
		
	}
	
	
	public static void main(String[] args) {
		BugTracker b = new BugTracker();
		b.bugId = 101;
		b.applicationName = "online food order";
		b.priority = "f1";
		b.bugTitle = "login is required";
		b.severity = "Low";
		b.status = "open";
		b. assignedDeveloper = "divya";
		
		System.out.println(b.bugId);
		System.out.println(b.applicationName);
		System.out.println(b.bugTitle);
		System.out.println(b.severity);
		System.out.println(b.priority);
		System.out.println(b.status);
		System.out.println(b.assignedDeveloper);
		b.getassignedDeveloper();
		b.assignToDeveloper(101,"sruthi");
		System.out.println(b.assignedDeveloper);

		
	}

}
