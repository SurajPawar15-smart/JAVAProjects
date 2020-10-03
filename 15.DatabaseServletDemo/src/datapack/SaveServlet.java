package datapack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name =request.getParameter("ename");
		String password =request.getParameter("epassword");
		String email =request.getParameter("email");
		String country =request.getParameter("ecountry");
		
		Employee e=new Employee();
		e.setEname(name);
		e.setEpassword(password);
		e.setEmail(email);
        e.setEcountry(country);
		
        int status =EmplDao.save(e);
        
        if(status > 0){
        	out.println("Record Inserted Successfully...!!!");
        	RequestDispatcher rd=request.getRequestDispatcher("index.html");
        	rd.include(request,response);
        }
        else{
        	out.println("Record not Inserted...!!!");
        }
		out.close();
	}
}

