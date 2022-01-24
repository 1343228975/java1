package javaee.Ch04.ch08.Filter;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class MyFilter02 implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {


    }
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out=response.getWriter();
        out.write("MyFilter02 Before<br />");
        chain.doFilter(request, response);
        out.write("<br />MyFilter02 After<br />");
    }
    public void destroy() {

    }
}
