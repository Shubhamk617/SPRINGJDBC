package com.shubham.service;

import com.shubham.model.Students;

public interface StudentService {

	public void getStudents() throws Exception;
	public void addStudent(Students student) throws Exception;
	public void modifyStudent(Students student) throws Exception;
	public void removeStudent(int studentId) throws Exception;

}
