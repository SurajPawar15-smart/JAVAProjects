package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("html/text");
		response.getWriter().println(request.getParameter("name")+"<br>");
		response.getWriter().println(request.getParameter("gender")+"<br>");
		
		PrintWriter out=response.getWriter();
		String[] languages=request.getParameterValues("language");
		if(languages != null){
			for(int i=0 ; i<languages.length ; i++){
				
				out.println(languages[i]);
				out.println("<br/>");
		      }
		      }
		     else{
				out.println("None Selected...!!!");
				out.println("<br/>");
			    }
		
		response.getWriter().println(request.getParameter("country")+"<br>");
		
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
