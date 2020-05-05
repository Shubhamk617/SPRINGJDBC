package com.shubham.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import com.shubham.Util.JdbcUtilUsingProperties;
import com.shubham.model.Students;

public class StudentDaoImplementation implements StudeentDao {
	public static String SELECT_QUERY = "select * from students";
	public static String INSERT_QUERY = "insert into students values (?, ?, ?, ? )";
	public static String DELETE_QUERY = "delete from students where s_id = ?";
	public static String UPDATE_QUERY = "update students set s_name= ?, s_branch=?, s_email =? where s_id =?";

	Connection conn;
	PreparedStatement pstmt;

	public List<Students> getStudentList() throws Exception {
		// TODO Auto-generated method stub
		conn = JdbcUtilUsingProperties.getConnection();
		conn.setAutoCommit(true);
		pstmt = conn.prepareStatement(SELECT_QUERY);
		ResultSet rs = pstmt.executeQuery();
		List<Students> students = new LinkedList<Students>();
		while (rs.next()) {
			Students stud = new Students();
			stud.setStudentID(rs.getInt(1));
			stud.setStudentName(rs.getString(2));
			stud.setStudentBranch(rs.getString(3));
			stud.setStudentEmail(rs.getString(4));
			students.add(stud);
		}

		JdbcUtilUsingProperties.close();
		return students;
	}

	public void insertStudent(Students student) throws Exception {
		// TODO Auto-generated method stub
		conn = JdbcUtilUsingProperties.getConnection();
		conn.setAutoCommit(true);

		pstmt = conn.prepareStatement(INSERT_QUERY);
		pstmt.setInt(1, student.getStudentID());
		pstmt.setString(2, student.getStudentName());
		pstmt.setString(3, student.getStudentBranch());
		pstmt.setString(4, student.getStudentEmail());

		pstmt.execute();
		JdbcUtilUsingProperties.close();
	}

	public void updateStudent(Students student) throws Exception {
		// TODO Auto-generated method stub
		conn = JdbcUtilUsingProperties.getConnection();
		conn.setAutoCommit(true);

		pstmt = conn.prepareStatement(UPDATE_QUERY);
		pstmt.setInt(1, student.getStudentID());
		pstmt.setString(2, student.getStudentName());
		pstmt.setString(3, student.getStudentBranch());
		pstmt.setString(4, student.getStudentEmail());

		pstmt.execute();
		JdbcUtilUsingProperties.close();
	}

	public void deleteStudent(int studentId) throws Exception {
		// TODO Auto-generated method stub
		conn = JdbcUtilUsingProperties.getConnection();
		conn.setAutoCommit(true);

		pstmt = conn.prepareStatement(DELETE_QUERY);
		pstmt.setInt(1, studentId);
		pstmt.execute();
		JdbcUtilUsingProperties.close();
	}
	public static void main(String[] args) throws Exception {
		StudentDaoImplementation daoImpl=new StudentDaoImplementation();
		daoImpl.getStudentList();
	}

}
