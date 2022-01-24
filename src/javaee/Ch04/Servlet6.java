package javaee.Ch04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet6", urlPatterns = "/Servlet6")
public class Servlet6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   response.setContentType("text/html;charset=utf-8");
       String user = request.getParameter("user");
       String pasw = request.getParameter("pasw");
   if (("nihao").equals(user) && ("123").equals(pasw)){
   response.sendRedirect("/welcome.html");}
   else
       {
       response.sendRedirect("/login.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request,response);
    }
}
