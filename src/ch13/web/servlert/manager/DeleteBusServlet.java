package ch13.web.servlert.manager;

import ch13.service.BusService;
import ch13.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteBusServlet", urlPatterns = "/DeleteBusServlet")
public class DeleteBusServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        this.doPost(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        BusService busService = new BusService();

        String id = req.getParameter("id");
        busService.deleteBus(id);
        //调用dao层方法


        req.getRequestDispatcher("/ListBusServlet").forward(req, resp);
    }
}
