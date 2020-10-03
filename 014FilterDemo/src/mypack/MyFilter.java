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

@WebFilter("/MyFilter")
public class MyFilter implements Filter {

    public MyFilter() {
       }

	public void destroy() {
		}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		  PrintWriter out=response.getWriter();  
		    out.print("filter is invoked before");  
		          
		    chain.doFilter(request, response);//sends request to next resource  
		          
		    out.print("filter is invoked after");  
	}
		//chain.doFilter(request, response);

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
