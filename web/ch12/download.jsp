<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-12-09
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.net.URLEncoder"%>

<html>
<head>

    <title>文件下载</title>
</head>
<body>

<a href="/DownloadServlet?filename=<%=URLEncoder.encode("牛.jpg", "utf-8")%>">文件下载 </a>
</body>
</html>