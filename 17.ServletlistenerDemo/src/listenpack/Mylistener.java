package listenpack;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


import java.sql.*
;
@WebListener
public class Mylistener implements ServletContextListener {
    public Mylistener() {
        
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
        try{
        	Class.forName("com.jdbc.mysql.Driver");
        	
        	try {
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sam","root","root");
				ServletContext context=sce.getServletContext();
				context.setAttribute("connect", con);
				PreparedStatement ps=con.prepareStatement("create table emplogs(name varchar(30),password varchar(10))");
				ps.executeUpdate();
				
			} 
        	catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
        catch(ClassNotFoundException e){
        	e.printStackTrace();
        }
    }
}
