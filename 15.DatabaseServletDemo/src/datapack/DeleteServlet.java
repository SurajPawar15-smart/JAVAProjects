package datapack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		int id=Integer.parseInt(request.getParameter("id"));
		int status=0;
		try{
			status=EmplDao.DeleteEmployee(id);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		if(status>0){
			out.println("Deleted");
			response.sendRedirect("ViewServlet");
		}		
		else{
			out.println("Not able to delete");
		}
	}

}
