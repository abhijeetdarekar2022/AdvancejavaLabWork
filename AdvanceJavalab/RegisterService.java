package form.cdac.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterService {
    
	public boolean isCustomerPresent(String email) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");

			boolean present = false;
			
			PreparedStatement pst = conn.prepareStatement("select count(*) from customer where email = ?");
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				int c = rs.getInt(1);
				if(c == 1)
					present = true;
			}
			return present;
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}
	}
	
	public void register(String name, String email, long mobileNo, String username, String password) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into customer(name, email, mobileno, username, password) values(?, ?, ?, ?, ?)");
			st.setString(1, name); //substituting ? with actual value
			st.setString(2, email);
			st.setLong(3, mobileNo);
			st.setString(4, username);
			st.setString(5, password);
			st.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try { conn.close(); } catch(Exception e) { }
		}		
	}
}
