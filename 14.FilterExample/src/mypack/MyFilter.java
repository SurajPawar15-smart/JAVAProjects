package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/FirstServlet")
public class MyFilter implements Filter {

    
    public MyFilter() {
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        
		String sname_error="",semail_error="",scourse_error="";
		boolean flag=true;
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String sname=request.getParameter("uname");
		String semail=request.getParameter("uemail");
		String scourse=request.getParameter("course");
		
		if(sname == null || sname.equals(""))
		{
			sname_error="Name is Required";
			flag=false;
		}
		
		if(semail == null || semail.equals(""))
		{
			semail_error="Email is Required";
			flag=false;
		}
		
		if(scourse == null || scourse.equals(""))
		{
			scourse_error="Course is Required";
			flag=false;
		}
		
		
	
		if(flag == true)
		{
		chain.doFilter(request, response);
		}
		else{
			out.println("<html><body>");
			out.println("<h1>Student Registartion Page</h1>");
			out.println("<h1>Upaltq</h1>");
			out.println("<form method='Post' action='FirstServlet'>");
			out.println("<table>");
			
			out.println("<tr>");
			out.println("<td>Student Name</td>");
			out.println("<td><input type='text' name='uname' value='"+sname+"'></td>");
			out.println("<td><font color='red' size='5'<b>"+sname_error+"</b></font></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Email</td>");
			out.println("<td><input type='text' name='uemail' value='"+semail+"'></td>");
			out.println("<td><font color='red' size='5'<b>"+semail_error+"</b></font></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.println("<td>Student Course</td>");
			out.println("<td><input type='text' name='course' value='"+scourse+"'></td>");
			out.println("<td><font color='red' size='5'<b>"+scourse_error+"</b></font></td>");
			out.println("</tr>");
			
			
			out.println("<tr>");
			out.println("<td><input type='submit' value='REGISTER'></td>");
			out.println("</tr>");
			
			out.println("</table>");
			out.println("</form>");
			out.println("</html></body>");
			}
		out.close();
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
