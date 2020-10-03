package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Cookie ck[]=request.getCookies();
		if(ck!=null){
			String name=ck[0].getValue();
			if(!name.contentEquals("")||name !=null){
				out.println("Welcome to Profile");
				out.println("Welcome"+" "+name);
			}
		}
		else{
			out.println("Please login first");
			RequestDispatcher rd2=request.getRequestDispatcher("login.html");
			rd2.include(request,response);
		}
		out.close();
	}

}
