package practicejdbc;

import java.sql.*;

public class LearnCon {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "4123");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into friends values('A','B','123456','D',109)");
			con.close();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
