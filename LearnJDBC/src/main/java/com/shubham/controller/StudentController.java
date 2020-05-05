package com.shubham.controller;

import java.util.Scanner;

import com.shubham.model.Students;
import com.shubham.service.StudentService;
import com.shubham.service.StudentServiceImplementation;

public class StudentController {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		Students student = new Students();
		StudentService studentService = new StudentServiceImplementation();
		sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("========================================================================");
			System.out.println("Welcome to Student Database of DSCE");
			System.out.println("========================================================================");
			System.out.println("1: Insert a Student");
			System.out.println("2: Delete a Student");
			System.out.println("3: Update a Student");
			System.out.println("4: List All Students");
			System.out.println("5: Quit");
			System.out.print("Enter Your Choice:");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.print("Enter StudentId: ");
				student.setStudentID(sc.nextInt());
				System.out.print("Enter StudentName: ");
				student.setStudentName(sc.next());
				System.out.print("Enter StudentBranch: ");
				student.setStudentBranch(sc.next());
				System.out.print("Enter StudentEmailId: ");
				student.setStudentEmail(sc.next());
				
				studentService.addStudent(student);
				break;
			case 2:
				System.out.print("Enter the studentId that needs to be deleted:");
				studentService.removeStudent(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter the details of student that needs to be updated");
				System.out.print("Enter StudentId: ");
				student.setStudentID(sc.nextInt());
				System.out.print("Enter StudentName: ");
				student.setStudentName(sc.nextLine());
				System.out.print("Enter StudentBranch: ");
				student.setStudentBranch(sc.nextLine());
				System.out.print("Enter StudentEmailId: ");
				student.setStudentEmail(sc.next());
				studentService.modifyStudent(student);
				break;
			case 4:
				System.out.println(":::Listing All Students:::");
				studentService.getStudents();
				break;
			case 5: System.exit(0);
			default:
				System.out.println("Wrong Data Entered.. Please Enter Valied Data...");
			}
		}
	}
}
