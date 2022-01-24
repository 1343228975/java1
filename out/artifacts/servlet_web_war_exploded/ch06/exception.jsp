<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-10-21
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>ecception</title>
</head>
<body>
<%!
    int a = 3;
    int b = 0;
%>
输出结果为:<%=(a/b)%><!--此处会产生异常-->

</body>
</html>
