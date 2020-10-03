package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class XmlServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//System.out.println("XML servlet called");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String fullname=request.getParameter("fullname");
		
		out.println("Hello from Post Method "+username+"!"+"We know you full name is "+fullname);
		String prof=request.getParameter("prof");
		out.println("You are a"+prof);
		
		//String location=request.getParameter("location");
		String[] location=request.getParameterValues("location");
		out.println("You are at"+location.length+"place");
		for(int i=0;i<location.length;i++){
			out.println(location[i]);
		}

}
}
//output
//http://localhost:8080/JBSimpleServletProject/XmlServlet
//XML servlet called

//or
//post method passing:
//http://localhost:8080/JBSimpleServletProject/XMLServletpath?usrename=suraj