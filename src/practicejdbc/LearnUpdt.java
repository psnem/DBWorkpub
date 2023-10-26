package practicejdbc;

import java.sql.*;

public class LearnUpdt {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "4123");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("update friends set mob=456123 where id =106");
			con.close();
			
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}

 