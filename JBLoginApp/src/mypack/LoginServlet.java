package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		LoginService loginService=new LoginService();
		
		boolean result=loginService.authenticate(userId,password);
		if(result){
			User user=loginService.getUserDetails(userId);
			request.getSession().setAttribute("user", user);
			RequestDispatcher dispatcher =request.getRequestDispatcher("/success.jsp");
			dispatcher.forward(request, response);
			return;
		}else{
			response.sendRedirect("login.jsp");
			return;
		}
	}

}
