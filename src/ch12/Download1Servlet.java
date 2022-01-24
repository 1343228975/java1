package ch12;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

//@WebServlet(name = "DownloadServlet", urlPatterns = "/DownloadServlet")
public class Download1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.setCharacterEncoding("utf-8");
        request.setCharacterEncoding("utf-8");
        String filename = request.getParameter("filename");
        filename = new String(filename.trim().getBytes("iso8859-1"), "UTF-8");
        String folder = "/download/";
        response.addHeader("Content-Type", "application/octet-stream");
        response.addHeader("Content-Disposition",
                "attachment;filename=" + URLEncoder.encode(filename, "utf-8"));
        InputStream in = getServletContext().getResourceAsStream(
                folder + filename);
        OutputStream out = response.getOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = in.read(buffer)) != -1) {
            out.write(buffer, 0, len);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse
            response) throws ServletException, IOException {
        doGet(request, response);
    }
}