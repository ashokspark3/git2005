package org.ojdbcsqlclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OjdbcSqlClass {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
		String query = "select * from employees";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			String employeeid = resultSet.getString("employee_id");
			System.out.println(employeeid);
			
		}
		connection.close();
		
	}
	
}
