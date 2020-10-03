package servletpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servletone")
public class Servletone extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Servletone() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletContext context=getServletContext();
		context.setAttribute("company", "google");
		out.println("Welcome to FirstServlet");
		out.println("<a href='Welcome'>Visit</a>");
		out.close();
		
	}

}
//output:
//http://localhost:8080/ContextAttributeDemo/Servletone
//	Welcome to FirstServlet Visit 
//	Welcome to googleCompany