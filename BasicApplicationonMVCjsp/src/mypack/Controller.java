package mypack;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param=request.getParameter("page");
		if(param.equals("login")){
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}
		else if(param.equals("signUp")){
			getServletContext().getRequestDispatcher("/signUp.jsp").forward(request, response);
		}
		else if(param.equals("about")){
			getServletContext().getRequestDispatcher("/about.jsp").forward(request, response);
		}
		else{
				getServletContext().getRequestDispatcher("/no-Found.jsp").forward(request, response);
			}
			
		}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
