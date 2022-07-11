package cdac.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Abhi")
public class Abhi extends HttpServlet {
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.write("<html><body>");
		out.write("<h1>Hello again !</h1>");
		out.write("<h2>Today's date is "+ LocalDate.now() + "</h2>");
		out.write("</body></html>");
	}

	
}
