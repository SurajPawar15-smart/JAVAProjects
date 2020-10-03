package mypack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	//RequestDispatcher rd=request.getRequestDispatcher("Forward1");
	//rd.forward(request,response);
	
	request.setAttribute("Message", "This message appended by include method");
	RequestDispatcher rd1=request.getRequestDispatcher("Include1");
	rd1.forward(request,response);
	
	}
}
