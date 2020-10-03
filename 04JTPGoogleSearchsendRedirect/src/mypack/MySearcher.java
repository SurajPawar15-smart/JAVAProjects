package mypack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MySearcher")
public class MySearcher extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MySearcher() {
        super();
        
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String name=request.getParameter("name");  
        response.sendRedirect("https://www.google.co.in/#q="+name);  
	}

}
