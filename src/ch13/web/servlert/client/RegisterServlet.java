package ch13.web.servlert.client;

import ch13.daomin.User;
import ch13.exception.RegisterException;
import ch13.service.UserService;
import ch13.utils.ActiveCodeUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        // 将表单提交的数据封装到javaBean
        User user = new User();
        try {
            BeanUtils.populate(user, request.getParameterMap());
            // 封裝激活码
            user.setActiveCode(ActiveCodeUtils.createActiveCode());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 调用service完成注册操作。
        UserService service = new UserService();
        try {
            service.register(user);
        } catch (RegisterException e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
            return;
        }
        // 注册成功，跳转到registersuccess.jsp
        response.sendRedirect(request.getContextPath() + "/client/registersuccess.jsp");
        return;
    }
}
