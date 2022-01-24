<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-10-21
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>pageContext</title>
</head>
<body>
<%
    //获取request对象
    HttpServletRequest request1 = (HttpServletRequest)pageContext;
    pageContext.setAttribute("str","java", PageContext.PAGE_SCOPE);
    request1.setAttribute("str","Java Web");
    String str1 = (String)pageContext.getAttribute("str",pageContext.PAGE_SCOPE);
    String str2 = (String)pageContext.getAttribute("str",pageContext.REQUEST_SCOPE);


%>
<%="page范围: " + str1 %><br/>

<%="request范围"+str2%>
</body>
</html>
