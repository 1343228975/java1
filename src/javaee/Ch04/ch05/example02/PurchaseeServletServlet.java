package javaee.Ch04.ch05.example02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "PurchaseeServletServlet", urlPatterns = "/PurchaseeServletServlet")
public class PurchaseeServletServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             String id = request.getParameter("id");
             if (id == null){
                 String url = "/ListBookServlet";
                 response.sendRedirect(url);
                 return;
             }
             Book book = BookDB.getBook(id);
        HttpSession session = request.getSession();
        List<Book> cart = (List) session.getAttribute("cart");
        if(cart == null){
            cart = new ArrayList<Book>();
            session.setAttribute("cart",cart);
            cart.add(book);
            Cookie cookie = new Cookie("JSESSIONID",session.getId());
            cookie.setMaxAge(60 * 30);
            cookie.setPath("/javaee/Ch04/ch05");
            response.addCookie(cookie);
            String url = "/CartServlet";
            response.sendRedirect(url);

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doPost(request,response);
    }
}
