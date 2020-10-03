package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Response;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ServletOne() {
        super();
    }
    @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        String uname=req.getParameter("username");
        
        HttpSession session=req.getSession();
        session.setAttribute("name",uname);
        
        ServletContext context=req.getServletContext();
        
        int total=(Integer)context.getAttribute("totalusers");
        int current=(Integer)context.getAttribute("currentusers");
        out.println("The total user visited :"+total+"<br>");
        out.println("The no. of current users is :"+current+"<br>");
        out.println("<a href='SecondServlet'>Click here to logout</a>");
        out.close();
    }
}
