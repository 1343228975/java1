<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-10-21
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>hello word</title>
</head>
<body>
  <%! int a = 1,b = 2; %>
  <%! public String print(){
      String str = "abc";
      return str;
  }%>
  <% out.println(a+b);%>
  <% out.println(print());%>
</body>
</html>
