package ch13.web.servlert.manager;

import ch13.daomin.Product;
import ch13.exception.ListProductException;
import ch13.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListProductServlet", urlPatterns = "/ListProductServlet")
public class ListProductServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1.创建service层的对象
        ProductService service = new ProductService();
        try {
            // 2.调用service层用于查询所有商品的方法
            List<Product> ps = service.listAll();
            // 3.将查询出的所有商品放进request域中
            request.setAttribute("ps", ps);
            // 4.重定向到list.jsp页面
            request.getRequestDispatcher("/admin/products/list.jsp").forward(
                    request, response);
            return;
        } catch (ListProductException e) {
            e.printStackTrace();
            response.getWriter().write(e.getMessage());
            return;
        }
    }
}
