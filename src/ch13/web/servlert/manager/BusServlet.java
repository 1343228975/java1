package ch13.web.servlert.manager;

import ch13.dao.BusDao;
import ch13.daomin.Busness;
import ch13.daomin.Busness;
import ch13.service.BusService;
import ch13.utils.ActiveCodeUtils;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;

@WebServlet(name = "BusServlet", urlPatterns = "/BusServlet")
public class BusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");


        Busness bean = new Busness();


        bean.setName(name);
        bean.setTelphone(phone);
        bean.setEmail(email);


        System.out.println(name + phone + email);

        BusDao busDao = new BusDao();
        try {
            busDao.addShop(bean);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect(request.getContextPath() + "/client/yes.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
