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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		
		System.out.println("User Id:"+userid);
		System.out.println("Password is:"+password);
		
		//response.sendRedirect("success.html");
		
		response.sendRedirect("success.html?userid=suraj&&password=suraj");
	}

}
//output:
//User Id:Suraj
//Password is:1234