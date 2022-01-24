<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-11-22
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<h3>这是一个测试对象属性信息监听器的页面</h3>
<%
    getServletConfig().getServletContext().setAttribute("username", "itcast");
    getServletConfig().getServletContext().setAttribute("username", "itheima");
    getServletConfig().getServletContext().removeAttribute("username");
    session.setAttribute("username", "itcast");
    session.setAttribute("username", "itheima");
    session.removeAttribute("username");
    request.setAttribute("username", "itcast");
    request.setAttribute("username", "itheima");
    request.removeAttribute("username");
%>
</body>
</html>
