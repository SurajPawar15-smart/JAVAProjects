package datapack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Employee e=null;
       
    
    public EditServlet() {
        super();
        
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		try {
			e=EmplDao.getOneEmployee(id);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		out.println("<html><body>");
		
		out.println("<form method='POST' action='EditTwo'>");
		
		out.println("<table style='cellspacing:'0';cellpadding:'0';'>");
		
		out.println("<tr><td style='padding-right:0px;'><input type='hidden' name='id' value='"+e.getId()+"'/></td></tr>");
		
		out.println("<tr><td>Name<input type='text' name='name' value='"+e.getEname()+"'/></td></tr>");
		
		out.println("<tr><td>Password<input type='password' name='password' value='"+e.getEpassword()+"'/></td></tr>");
		
		out.println("<tr><td>Email<input type='text' name='email' value='"+e.getEmail()+"'/></td></tr>");
		
		out.println("<tr><td>Country</td></tr>");
		
		out.println("<tr><td><select name='country' style='width:150px'></td></tr>");
		
		out.println("<option>India</option>");
		
		out.println("<option>USA</option>");
		
		out.println("<option>UK</option>");
		
		out.println("<option>Other</option>");
		
		out.println("</select>");
		
		out.println("</td></tr>");
		
		out.println("<tr><td colspan='2'><input type='submit' value='Edit & Save' /></td></tr>");
		
		
		out.println("</table>");
		out.println("</form>");
		out.println("</body></html>");
		
		
		
		
	}

}
