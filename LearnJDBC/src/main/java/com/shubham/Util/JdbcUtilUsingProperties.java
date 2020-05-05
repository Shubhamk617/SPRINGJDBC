package com.shubham.Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtilUsingProperties {
	public static Connection conn;
	public static PreparedStatement pstmt;
	public static Properties props;

	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		loadProperties();
		Class.forName(System.getProperty("DBDriver"));
		conn = DriverManager.getConnection(System.getProperty("DBUrl"), System.getProperty("UserId"),
				System.getProperty("Password"));
		return conn;
	}

	public static void loadProperties() throws IOException {
		props = new Properties();
		InputStream inStream = new FileInputStream("src/main/resources/configurations.properties");
		props.load(inStream);
		for (String key : props.stringPropertyNames()) {
			String value = props.getProperty(key);
			System.setProperty(key, value);
		}
		inStream.close();
	}

	public static void close() throws Exception {
		if (conn != null)
			conn.close();
		if (pstmt != null)
			pstmt.close();

	}

	public static void main(String[] args) throws IOException {
		loadProperties();
	}

}
