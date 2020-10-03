package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public MyListener() {
        
    }

    public void contextInitialized(ServletContextEvent e) {  
ArrayList list=new ArrayList();  
try{  
Class.forName("com.mysql.jdbc.driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test76","root","root");  
        
PreparedStatement ps=con.prepareStatement("select * from csuser");  
ResultSet rs=ps.executeQuery();  
while(rs.next()){  
User u=new User();  
u.setId(rs.getInt(1));  
u.setName(rs.getString(2));  
u.setPassword(rs.getString(3));  
list.add(u);  
}  
con.close();  
        
}catch(Exception ex){System.out.print(ex);}  

//storing the ArrayList object in ServletContext       
ServletContext context=e.getServletContext();  
context.setAttribute("data",list);  
    
}  
public void contextDestroyed(ServletContextEvent arg0) 
{  
System.out.println("project undeployed...");  
}  
	
}

