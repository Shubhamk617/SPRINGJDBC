package com.shubham.service;

import java.util.List;

import com.shubham.dao.StudeentDao;
import com.shubham.dao.StudentDaoImplementation;
import com.shubham.model.Students;

public class StudentServiceImplementation implements StudentService {
	StudeentDao studentDao = new StudentDaoImplementation();

	public void getStudents() throws Exception {
		// TODO Auto-generated method stub
		List<Students> students = studentDao.getStudentList();
		for (Students student : students) {
			System.out.println(student.toString());
		}
	}

	public void addStudent(Students student) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inserting New Student");
		studentDao.insertStudent(student);
	}

	public void modifyStudent(Students student) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Updating Student..");
		studentDao.updateStudent(student);
	}

	public void removeStudent(int studentId) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Deleting Student with StudentId :" + studentId);
		studentDao.deleteStudent(studentId);
	}
}
