package javaee.Ch04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet_requstLine", urlPatterns = "/Servlet_requstLine")
public class Servlet_requstLine extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("getMethod:"+request.getMethod()+"<br />");
        out.println("getRqueryString:"+request.getRequestURI()+"<br />");
        out.println("getProtocol:"+request.getProtocol()+"<br />");
        out.println("getConrxerPath:"+request.getContextPath()+"<br />");
        out.println("getpathinfo:"+request.getPathInfo()+"<br />");
        out.println("getpatnTranslate:"+request.getPathTranslated()+"<br />");
        out.println("getserveltpath:"+request.getServletPath()+"<br />");
        out.println("getRemoteAddr:"+request.getRemoteAddr()+"<br />");
        out.println("getRemoteHost:"+request.getRemoteHost()+"<br />");
        out.println("gerRemotePort:"+request.getRemotePort()+"<br />");
        out.println("getLocalAddr:"+request.getLocalAddr()+"<br />");
        out.println("getLocalHost"+request.getLocalName()+"<br />");
        out.println("getLocalPort:"+request.getLocalPort()+"<br />");
        out.println("getserveltName:"+request.getServerPort()+"<br />");
        out.println("getRequestURL:"+request.getRequestURL()+"<br />");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request,response);
    }
}
