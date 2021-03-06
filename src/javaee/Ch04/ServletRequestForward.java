package javaee.Ch04;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletRequestForward", urlPatterns = "/ServletRequestForward")
public class ServletRequestForward extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             response.setContentType("text/html;charset=utf-8");
             request.setAttribute("company","北京传智播客教育科技有限公司");
        RequestDispatcher dispatcher = request.getRequestDispatcher("/ResultServlet");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           doPost(request,response);
    }
}
