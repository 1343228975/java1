package javaee.Ch04;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_RequestParams", urlPatterns = "/Servlet_RequestParams")
public class Servlet_RequestParams extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                  request.setCharacterEncoding("utf-8");
                 String name = request.getParameter("user");
                 String password = request.getParameter("pasw");
                 System.out.println("用户名"+name);
                 System.out.println("密码"+password);
                 String[] hobbys = request.getParameterValues("hobby");
                 System.out.println("爱好:");
        for (int i = 0; i < hobbys.length ; i++) {
            System.out.println(hobbys[i]+"、");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }
}
