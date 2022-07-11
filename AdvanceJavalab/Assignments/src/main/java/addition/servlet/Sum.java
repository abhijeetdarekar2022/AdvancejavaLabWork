package addition.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sum")
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int first =Integer.parseInt(request.getParameter("First"));
		int second =Integer.parseInt(request.getParameter("Second"));
		String str = request.getParameter("operation");
		
		int result =0;
		if(str.equals("add"))
			result = first + second ;
		else  if(str.equals("sub"))
			result = first - second ;
		else  if(str.equals("mul"))
			result = first * second ;
		else  if(str.equals("div"))
			result = first / second ;
		
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Answer is  "+ result+"</h1>");
		
		out.write("</body></html>");
	}

	

}
