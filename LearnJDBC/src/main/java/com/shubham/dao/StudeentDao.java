package com.shubham.dao;

import java.util.List;

import com.shubham.model.Students;

public interface StudeentDao {
	public List<Students> getStudentList() throws Exception;
	public void insertStudent(Students student) throws Exception;
	public void updateStudent(Students student) throws Exception;
	public void deleteStudent(int studentId) throws Exception;
		
}
