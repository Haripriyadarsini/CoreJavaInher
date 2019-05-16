package org.connect;

import java.awt.print.Printable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnect2 {

	public static void main(String[] args) throws Exception {
		// Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Connect to DB
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails", "root", "lumia");

		// create statement
		Statement Statement = con.createStatement();

		// execute the query
		ResultSet result = Statement.executeQuery("SELECT * FROM employeedetails.emp;");

		// Get the data result
		while (result.next()) {
			System.out.println(result.getString(1) + result.getString(2));

		}
		Statement.close();
		con.close();
	}

}
