<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-11-22
  Time: 17:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示登录的用户信息</title>
</head>
<body>
<br />
<center>
    <h3>欢迎光临</h3>
</center>
<br />
<br />
<c:choose>
    <c:when test="${sessionScope.user==null }">
        <a href="${pageContext.request.contextPath }/login.jsp">用户登录</a>
    </c:when>
    <c:otherwise>
        欢迎你，${sessionScope.user.username }!
        <a href="${pageContext.request.contextPath }/LogoutServlet">注销</a>
    </c:otherwise>
</c:choose>
<hr />
</body>
</html>

