package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("username");
		out.println("<h1>"+"Hello"+" "+name+"</h1>");
		out.println("<a href='SecondServlet?uname="+name+"'>Visit Page</a>");
		
		//http://localhost:8080/GetPostDifference/mypack.FirstServlet?username=suraj
		out.close();
	}

}
//output:
//Name=Suraj
//http://localhost:8080/GetPostDifference/FirstServlet?username=suraj
//Hello suraj
//Visit Page 
//Welcome to Get suraj