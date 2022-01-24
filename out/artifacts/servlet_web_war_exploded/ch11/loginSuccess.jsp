<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-12-02
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>login successfully</title>
    <style type="text/css">
        #main {
            width: 500px;
            height: auto;
        }
        #main div {
            width: 200px;
            height: auto;
        }
        ul {
            padding-top: 1px;
            padding-left: 1px;
            list-style: none;
        }
    </style>
</head>
<body>
<%
    if (session.getAttribute("userBean") == null) {
%>
<jsp:forward page="/ch11/register.jsp" />
<%
        return;
    }
%>
<div id="main">
    <div id="welcome">恭喜你，登录成功</div>
    <hr />
    <div>您的信息</div>
    <div>
        <ul>
            <li>您的姓名:${userBean.name }</li>
            <li>您的邮箱:${userBean.email }</li>
        </ul>
    </div>
</div>
</body>
</html>
