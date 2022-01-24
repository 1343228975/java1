package javaee.Ch04.ch08.Servlet;

import javaee.Ch04.ch08.entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Login1Servlet", urlPatterns = "/Login1Servlet")
public class Login1Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        // 获得用户名和密码
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("itcast".equals(username) && "123456".equals(password)) {

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            request.getSession().setAttribute("user", user);
            // 发送自动登录的cookie
            String autoLogin = request.getParameter("apologia");
            if (autoLogin != null) {
                // 注意 cookie 中的密码要加密
                Cookie cookie = new Cookie("apologia", username + "-"
                        + password);
                cookie.setMaxAge(Integer.parseInt(autoLogin));
                cookie.setPath(request.getContextPath());
                response.addCookie(cookie);
            }
            // 跳转至首页
            response.sendRedirect(request.getContextPath()+"/index.jsp");
        } else {
            request.setAttribute("errorMsg", "用户名或密码错");
            request.getRequestDispatcher("/javaee/Ch04/ch08/login.jsp")
                    .forward(request,response);
        }
    }


    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
