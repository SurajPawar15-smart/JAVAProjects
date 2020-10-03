package datapack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditTwo")
public class EditTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		response.setContentType("text/html");
		Employee e=new Employee();
		
		PrintWriter out=response.getWriter();
		int id =Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("ename");
		String password=request.getParameter("epassword");
		String email=request.getParameter("email");
		String country=request.getParameter("ecountry");
		
		e.setId(id);
		e.setEname(name);
		e.setEpassword(password);
		e.setEmail(email);
		e.setEcountry(country);
		try
		{
	    status=EmplDao.updateEmployee(e);
	    }
	    catch(ClassNotFoundException  e1)
	       {
		      e1.printStackTrace();
	       }
		if(status>0){
			out.println("updated");
			response.sendRedirect("ViewServlet");
		}
		else{
			
			out.println("Table not UPDATED...!!!");
			
		}
		doGet(request, response);
	}

}