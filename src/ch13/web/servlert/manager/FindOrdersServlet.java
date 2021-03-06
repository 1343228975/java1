package ch13.web.servlert.manager;

import ch13.daomin.Order;
import ch13.service.OrderService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FindOrdersServlet", urlPatterns = "/FindOrdersServlet")
public class FindOrdersServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 创建Service层对象
        OrderService service = new OrderService();
        // 调用Service层对象的findAllOrder()方法查询订单列表
        List<Order> orders = service.findAllOrder();
        //将查询到的订单信息添加到request作用域
        request.setAttribute("orders", orders);
        // 将请求转发到list.jsp页面
        request.getRequestDispatcher("/admin/orders/list.jsp").forward(request,response);
    }
}

