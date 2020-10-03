package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet2")
public class DemoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DemoServlet2() {
    	
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{  
			  
			response.setContentType("text/html");  
			PrintWriter out=response.getWriter();  
			  
			ServletContext context=getServletContext();  
			String n=(String)context.getAttribute("company");  
			  
			out.println("Welcome to "+n);  
			out.close();  
			  
			}catch(Exception e){
				e.printStackTrace();}  }
}
//output:
//http://localhost:8080/07ServletContext_set_and_get_attributes/DemoServlet1
//Welcome to first servlet visit 
//Welcome to IBM 