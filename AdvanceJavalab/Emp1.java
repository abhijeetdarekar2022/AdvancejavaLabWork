package com.cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Emp1")
public class Emp1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int empid = Integer.parseInt(request.getParameter("empid"));
		String ename = request.getParameter("ename");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "cdac");
			PreparedStatement st = conn.prepareStatement("insert into Emp1(empid, ename) values(?, ?)");
		
			st.setInt(1, empid);
			st.setString(2, ename);
			st.executeUpdate();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Registration successful!</h1>");
		out.write("</body></html>");
	}

	
}
