import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloWorld extends HttpServlet {

	private String message;

	  public void init() throws ServletException
	  {
	      // Do required initialization
	      message = "Sample Project 1";
	  }

	  public void doGet(HttpServletRequest request,
	                    HttpServletResponse response)
	            throws ServletException, IOException
	  {
		  PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	      // Set response content type
	      response.setContentType("text/html");
	      HttpSession session=request.getSession();
    	  session.setAttribute("session", "PulkitNewSession");
    	  out.println("<br><h1> Session :"+session+"</h1>");
    	  out.println("<br><h1> Session Values :"+session.getAttribute("session")+"</h1>");
	      // Actual logic goes here.
	      
	  }
	  
	  public void destroy()
	  {
	      // do nothing.
	  }
}
