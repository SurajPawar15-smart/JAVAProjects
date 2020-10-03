package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	
		String name=request.getParameter("username");
		String passowrd1=request.getParameter("password");
		
		PrintWriter out=response.getWriter();
		if(passowrd1.equals("suraj") && name.equals("suraj"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");
			rd.forward(request, response);
		}
		else{
			out.println("sorry Wrong username and password");
			RequestDispatcher rd2=request.getRequestDispatcher("index.html");
			rd2.include(request,response);
		}
		
	}
}
//output:if password and username is match
//Welcome suraj
//Enjoy your day 
//output:if  not password and username is match
//again come in the same file of index.html