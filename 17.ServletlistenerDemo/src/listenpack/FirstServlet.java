package listenpack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       int status=0;
    
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	String name=request.getParameter("username");
	String password =request.getParameter("password");
	ServletContext context=getServletContext();
	try{
	Connection con=(Connection)context.getAttribute("connect");
	java.sql.PreparedStatement ps=con.prepareStatement("insert into emplogs(name,password)values(?,?)");
	ps.setString(1,name);
	ps.setString(1,password);
	status=ps.executeUpdate();
	}
	
	catch(SQLException e){
		e.printStackTrace();
	}
	if(status>0){
		out.println("Value Inserted");
	}
	else{
		out.println("Check your code");
	}
	}

}