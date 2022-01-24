package javaee.Ch04.ch08.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(filterName = "MyFilter")
public class MyFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {

    }
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out=response.getWriter();
        out.write("Hello MyFilter");
    }
    public void destroy() {

    }
}
