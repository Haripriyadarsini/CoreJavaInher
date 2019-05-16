/*JAVA database connectivity 
***Import java.sql***
1.Load the driver
2.connect to DB
3.Write the SQL query
4.Prepare statement
5.Execute the query
6.Get the data result
7.Close the DB connection
*/


package org.connect;
import java.sql.*;
public class JDBCConnect {

	public static void main(String[] args) throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/employeedetails?useTimezone=true&serverTimezone=UTC";
		String Uname = "root";
		String Pwd = "lumia";
		String Query= "select Empusername from emp where Empid=103";
		
		//Load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	    //Connect to Database
	Connection con=DriverManager.getConnection(url, Uname, Pwd);
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(Query);
	rs.next();
	String name = rs.getString("Empusername");
	System.out.println(name);
	st.close();
	con.close();
	}

}
