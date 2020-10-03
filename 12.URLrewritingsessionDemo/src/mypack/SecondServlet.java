package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		String course=request.getParameter("ucourse");
		
		out.println("<html><body style='background-color:#fefbd8;'>");
		out.println("<h1>"+"Welcome to Upgrade"+name+"</h1>");
		out.println("<h1>"+"The Course is"+course+"</h1>");
		out.println("</html></body>");
		out.close();
		
	}

}
