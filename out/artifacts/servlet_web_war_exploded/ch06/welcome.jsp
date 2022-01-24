<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-10-21
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>weclcome page</title>
</head>
<body>
你好,欢迎进入首页,当前访问时间是:
<%
    out.println(new java.util.Date);
%>
</body>
</html>
