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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String sname=request.getParameter("username");
		out.println("<html>");
		out.println("<body style= 'background-color:#d3d3d3;'>");//given backgrounp color
		out.println("<h1>"+"WELCOME TO HIDDEN FORM "+"</h1>");
		out.println("<form method='Post' action='SecondServlet'>");
		out.println("<input type='hidden' name='name' value='"+sname+"' >");//creating a hidden form field
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
