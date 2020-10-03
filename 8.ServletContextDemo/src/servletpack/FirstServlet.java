package servletpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
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
	    response.setContentType("text.html");
		PrintWriter out=response.getWriter();
	    ServletContext context=getServletContext();
	    String driver=context.getInitParameter("driver");
	    out.println("<html><body>");
	    out.println("<h1>"+driver+"</h1>");
	    out.println("</body></html>");
	    out.close();
	}

}
//output:
//http://localhost:8080/ServletContextDemo/FirstServlet
//jdbc:mysql://localhost:3306/fruits,"root","root"
