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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("username");
		String course=request.getParameter("course");
		out.println("<html><body style='background-color:#fefbd8;'>");
		out.println("<h1>"+"Welcome to Upgrade"+"</h1>");
		out.println("<a href='SecondServlet?uname="+name+"&ucourse="+course+"'>Visit</a>");
		out.println("</body></html>");
		out.close();
		
		
		
		
		
	}

}
