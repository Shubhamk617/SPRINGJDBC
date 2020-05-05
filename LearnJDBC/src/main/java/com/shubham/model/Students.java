package com.shubham.model;

public class Students {
	private int studentID;
	private String studentName;
	private String studentBranch;
	private String studentEmail;
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int studentID, String studentName, String studentBranch, String studentEmail) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentBranch = studentBranch;
		this.studentEmail = studentEmail;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentBranch() {
		return studentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", studentName=" + studentName + ", studentBranch=" + studentBranch
				+ ", studentEmail=" + studentEmail + "]";
	}
	
}
