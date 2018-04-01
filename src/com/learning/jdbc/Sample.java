package com.learning.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by vinayshanbhag on 3/31/18.
 */
public class Sample {
	
	
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://127.0.0.1:3306/employees_database";
	     Connection connection = DriverManager.getConnection(url,"root","tcsrocks");

	     Statement statement = connection.createStatement();



	     ResultSet resultSet = statement.executeQuery("select * from employees_tbl");

	     while(resultSet.next()){
	         System.out.println(resultSet.getString("name"));
	     }

	}
	 }
