package cdac.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Assign2")
public class Assign2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String date = null;
		int age =0;
		
		try {
			date = request.getParameter("Dob");
		}catch(Exception e) {}
		
		LocalDate date1 = LocalDate.parse(date);
		
		date1.getYear();
		LocalDate date2 = java.time.LocalDate.now();
		
		age = date2.getYear() - date1.getYear();
		
		Period p = Period.between(date1, date2);
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Age in year "+ age +" </h1>");
		out.write("<h1> You are " + p.getYears() + " Years " + p.getMonths() + " Month " + p.getDays() + " Days ");
		out.write("</body></html>");
		
	}

}
