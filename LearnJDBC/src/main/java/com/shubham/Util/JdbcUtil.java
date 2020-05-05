package com.shubham.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcUtil {
	public static Connection conn;
	public static PreparedStatement pstmt;

	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "shubhamk617", "Shubhamk%617%");
		return conn;
	}

	public static void close() throws Exception {
		if (conn != null)
			conn.close();
		if (pstmt != null)
			pstmt.close();

	}

}
