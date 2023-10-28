package practicejdbc;

import java.sql.*;



public class Retrive{
	public static void main(String[] args) {
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","4123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from students");
			while(rs.next()) {
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println("++++++++++++++++++++++++++");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}