package practicejdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class LearnDel {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root", "4123");
			
			Statement stmt=con.createStatement();
			
			stmt.executeUpdate("delete from friends where id =109");
			con.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
