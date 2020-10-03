package mypack;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DisplayImage")
public class DisplayImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DisplayImage() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("image/jpeg");  
		// PrintWriter outt=response.getWriter();
		 
		    ServletOutputStream out;  
            out = response.getOutputStream();  
		    FileInputStream fin = new FileInputStream("D:\\pramod wadekare\\MY IMAGES\\IMG.jpg");  
		    //outt.println("<h1>Pramod Wadekare </h1>");
		      
		    BufferedInputStream bin = new BufferedInputStream(fin);  
		    BufferedOutputStream bout = new BufferedOutputStream(out);  
		    int ch =0; ;  
		    while((ch=bin.read())!=-1)  
		    {  
		    bout.write(ch);  
		    }  
		      
		    bin.close();  
		    fin.close();  
		    bout.close();  
		    out.close();  
		    }  
	}
