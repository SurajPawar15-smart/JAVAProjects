package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    public FirstServlet() {
        super();
        //System.out.println("Inside the no-argument constructors...!!!");
    }
    
    @Override
    public void init() throws ServletException {
    	//System.out.println("Inside the init() method...!!!");
    	//System.out.println("Inside the init() method...!!!");
    	super.init();
    }
    @Override
    protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
    	//System.out.println("Inside the service() method...!!!");
    	super.service(arg0, arg1);
    }
    @Override
    public void destroy() {
    	//System.out.println("Inside the destroy() method...!!!");
    	super.destroy();
    }
   // @Override
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	response.setContentType("text/html");
//	PrintWriter out=response.getWriter();
//	
//	String fname=request.getParameter("fname");
//	String lname=request.getParameter("lname");
//	System.out.println("My name is "+fname+" "+lname);
//	System.out.println("This is From GET method");
//	out.println("FirstName is :"+" "+fname);
//	out.println("LastName is:"+" "+lname);
//	out.println("<html><body>"+"<h1>"+"My name is "+fname+" "+lname+"</h1>"+"</body></html>");
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		List<Student> list=new ArrayList<Student>();
		Student student=new Student();
	
		student.setName("Monika");
		student.setAge(98);
		student.setLocation("Pune");
		list.add(student);
		//req.setAttribute("list", list);
		
		Student student1=new Student();
		student1.setName("Pranay");
		student1.setAge(16);
		student1.setLocation("Pune");
		list.add(student1);
		//req.setAttribute("list", list);
	
		Student student3=new Student();
		student3.setName("pratik");
		student3.setAge(23);
	    student3.setLocation("PUNE");
		list.add(student3);
		
        req.setAttribute("list", list);
		
		
		
		String[] countries={"India","Japan","China","America","South Africa"};
		req.setAttribute("countries", countries);
		
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String fullname=fname+" "+lname;
		
		req.setAttribute("name", fullname);
//		req.setAttribute("student", student);
//		req.setAttribute("student", student);
//		req.setAttribute("student", student);
		out.println(fullname);
		
		RequestDispatcher rd=req.getRequestDispatcher("/output.jsp");
		rd.forward(req, resp);
		
		
		//resp.sendRedirect("test.html");
		
		
		
		//resp.sendRedirect("http://www.google.com");
	
		
		
	}
}
//output.html --->content inside a body
//<p>Hello ,this is my full name:<%= request.getAttribute("name")%></p>


//jstl references (Download a link for more programs)