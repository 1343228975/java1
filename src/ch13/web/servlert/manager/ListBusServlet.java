package ch13.web.servlert.manager;

import ch13.daomin.Busness;
import ch13.daomin.Notice;
import ch13.service.BusService;
import ch13.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListBusServlet", urlPatterns = "/ListBusServlet")
public class ListBusServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BusService busService = new BusService();
        List<Busness> bus = busService.getAllInfo();
        request.setAttribute("bus", bus);


        System.out.println(bus);
        request.getRequestDispatcher("/admin/bus/bus.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost(request,response);
    }
}
