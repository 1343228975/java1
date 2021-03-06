package ch12;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.UUID;

@WebServlet(name = "UploadServlet", urlPatterns = "/UploadServlet")
public class Upload1Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=utf-8");
            DiskFileItemFactory factory = new DiskFileItemFactory();
            File f = new File("I:\\Servlet");
            if (!f.exists()) {
                f.mkdirs();
            }
            factory.setRepository(f);
            ServletFileUpload fileupload = new ServletFileUpload(factory);
            fileupload.setHeaderEncoding("utf-8");
            List<FileItem> fileitems = fileupload.parseRequest(request);
            PrintWriter writer = response.getWriter();
            for (FileItem fileitem : fileitems) {
                if (fileitem.isFormField()) {
                    String name = fileitem.getFieldName();
                    if (name.equals("name")) {
                        if (!fileitem.getString().equals("")) {
                            String value = fileitem.getString("utf-8");
                            writer.print("上传者：" + value + "<br>");
                        }
                    }
                } else {
                    String filename = fileitem.getName();
                    if (filename != null && !filename.equals("")) {
                        writer.print("上传的文件名称是：" + filename + "<br>");
                        filename = filename.substring(filename.lastIndexOf("\\") + 1);
                        filename = UUID.randomUUID().toString() + "_" + filename;
                        String webPath = "/upload/";
                        String filepath = getServletContext().getRealPath(webPath + filename);
                        File file = new File(filepath);
                        file.getParentFile().mkdirs();
                        file.createNewFile();
                        InputStream in = fileitem.getInputStream();
                        FileOutputStream out = new FileOutputStream(file);
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = in.read(buffer)) > 0)
                            out.write(buffer, 0, len);

                        in.close();
                        out.close();

                        fileitem.delete();
                        writer.print("上传文件成功！<br>");
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
