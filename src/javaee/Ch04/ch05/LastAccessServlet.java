package javaee.Ch04.ch05;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "LastAccessServlet", urlPatterns = "/LastAccessServlet")
public class LastAccessServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        this.doPost(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        String lastAccesstime = null;
        Cookie[] cookies = request.getCookies();
        for (int i = 0;  cookies != null && i < cookies.length; i++) {
            if ("lastAccesss".equals(cookies[i].getName())){
                lastAccesstime = cookies[i].getValue();
                break;
            }
        }
        if (lastAccesstime == null){

            response.getWriter().println("你是首次访问本网站");

        }
        else{

            response.getWriter().println("你上次访问的时间是: "+lastAccesstime);

        }
        String currentTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        Cookie cookie = new Cookie("lastAccess",currentTime);
        response.addCookie(cookie);

    }
}
