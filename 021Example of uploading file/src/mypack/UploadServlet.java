package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.*;  
import com.oreilly.servlet.MultipartRequest;  

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UploadServlet() {
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		   try{       
		MultipartRequest m=new MultipartRequest(request,"D:/iteams collections");  
		out.print("successfully uploaded");  
		   }catch(Exception e){
			   e.printStackTrace();
		   }
	}

}
//enctype="multipart/form-data
