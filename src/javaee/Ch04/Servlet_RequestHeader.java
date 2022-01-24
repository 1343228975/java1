package javaee.Ch04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "Servlet_RequestHeader", urlPatterns = "/Servlet_RequestHeader")
public class Servlet_RequestHeader extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Enumeration headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()){
            String headname = (String) headerNames.nextElement();
            out.print(headname+":"+request.getHeader(headname)+"<br />");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        


        doPost(request,response);
    }
}
