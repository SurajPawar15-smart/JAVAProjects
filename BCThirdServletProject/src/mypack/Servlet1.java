package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		
		String CompanyName=getServletConfig().getInitParameter("CompanyName");
		String Address=getServletConfig().getInitParameter("Address");
		String CompanyEmail=getServletContext().getInitParameter("Email");
		
		pr.println("Company Name is :"+CompanyName);
		pr.println("Company Address is:"+Address);
		pr.println("Company Email is:"+CompanyEmail);
		pr.close();
	}

}
