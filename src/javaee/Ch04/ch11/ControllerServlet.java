package javaee.Ch04.ch11;

import javaee.Ch04.ch11.dbutil.DBUtil;
import javaee.Ch04.ch11.domain.ReginsterFormBean;
import javaee.Ch04.ch11.domain.UserBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ControllerServlet", urlPatterns = "/ControllerServlet")
public class ControllerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        response.setHeader("Content-type", "text/html;charset=GBK");
        response.setCharacterEncoding("GBK");

        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        String email = request.getParameter("email");

        ReginsterFormBean formBean = new ReginsterFormBean();
        formBean.setName(name);
        formBean.setPassword(password);
        formBean.setPassword2(password2);
        formBean.setEmail(email);

        if (!formBean.validate()) {
            request.setAttribute("formBean", formBean);
            request.getRequestDispatcher("/javaee/Ch04/ch11/register.jsp").forward(request, response);
            return;
        }

        UserBean userBean = new UserBean();
        userBean.setName(name);
        userBean.setPassword(password);
        userBean.setEmail(email);

        boolean b = DBUtil.getInstance().insertUser(userBean);

        if (!b) {
            request.setAttribute("DBMes", "你注册的用户已存在");
            request.setAttribute("formBean", formBean);
            request.getRequestDispatcher("/javaee/Ch04/ch11/register.jsp").forward(request, response);
            return;
        }
        response.getWriter().print("恭喜你注册成功，3秒钟自动跳转");

        request.getSession().setAttribute("userBean", userBean);

        response.setHeader("refresh", "3;url=/javaee.Ch04.ch11/loginSuccess.jsp");
    }
}
