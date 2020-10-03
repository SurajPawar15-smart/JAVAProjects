package datapack;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		try{
	    list=EmplDao.getAllEmployees();
		}
		catch(ClassNotFoundException e)
		{
		e.printStackTrace();
		}
		
		out.println("<html><body style='background-color:lightblue;'>");
		out.println("<table border='1' >");
		out.println("<tr><td>Id</td><td>Name</td><td>Password</td><td>Email</td><td>Country</td><td>Edit</td><td>Delete</td></tr>");
		
		for(Employee e:list)
		{
			out.println("<tr><td>"+e.getId()+"</td><td>"+e.getEname()+"</td><td>"+e.getEpassword()+"</td><td>"+e.getEmail()+"</td><td>"+e.getEcountry()+"</td><td><a href='EditServlet?id="+e.getId()+"'>Edit Employee</a></td><td><a href='DeleteServlet?id="+e.getId()+"'>DeleteEmployee</a></td></tr>");
		}
		out.println("</table>");
		out.println("</body></html>");
}

}
