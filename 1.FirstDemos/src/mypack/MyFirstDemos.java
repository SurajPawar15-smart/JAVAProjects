package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "MyFirstDemoss", urlPatterns = { "/MyFirstDemoss" })
public class MyFirstDemos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MyFirstDemos() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		String n=request.getParameter("username");
		out.println("Welcome to"+" "+n+" "+"as we are studing a Servlet with lots of codes");
	}

}
//output:
//Welcome to Suraj as we are studing a Servlet with lots of codes 