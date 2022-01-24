<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-12-22
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<head>

    <title>传智书城注册页面</title>
    <%--导入css和js --%>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/client/css/main.css" type="text/css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/client/js/bus.js" charset=”gb2312″ ></script>

</head>

<body class="main">
<!-- 1.网上书城顶部 start -->
<%@include file="head.jsp"%>
<!-- 网上书城顶部  end -->
<!--2. 网上书城菜单列表  start -->
<%@include file="menu_search.jsp" %>
<!-- 网上书城菜单列表  end -->
<!-- 3.网上书城用户注册  start -->
<div id="divcontent" >
    <form action="${pageContext.request.contextPath}/BusServlet" method="post" onsubmit="return checkForm();">
        <table width="850px" border="0" cellspacing="0">
            <tr>
                <td style="padding: 30px"><h1>商家合作信息</h1>
                    <table width="70%" border="0" cellspacing="2" class="upline">
                        <tr>
                            <td style="text-align: right; width: 20%">姓名：</td>
                            <td style="width: 40%">
                                <input type="text" class="textinput"  id="name" name="name" onkeyup="checkName();"/>

                            </td>
                            <td><span id="nameMsg"></span><span color="#999999">请输入你的姓名</span></td>

                        </tr>
                        <tr>
                            <td style="text-align: right">电话号码：</td>
                            <td><input type="text" class="textinput"  id="phone" name="phone" onkeyup="checkTelphone();"/>
                            </td>
                            <td><span id="telMsg"></span><span color="#999999">请正确填写你的电话号码</span></td>

                        </tr>
                        <tr>
                            <td style="text-align: right">电子邮箱：</td>
                            <td><input type="email" class="textinput"  id="email" name="email" onkeyup="checkEmail();"/></td>
                            <td><span id="emailMsg"></span><span color="#999999">请输入你的电子邮箱</span></td>
                        </tr>



                    </table>



                    <table width="70%" border="0" cellspacing="0">
                        <tr>
                            <td style="padding-top: 20px; text-align: center">
                                <input type="image" src="images/signup.gif" name="submit" border="0" width="140" height="35"/>
                            </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>
    </form>
</div>

<!-- 网上书城用户注册  end -->
<!--4. 网上书城下方显示 start -->
<%@ include file="foot.jsp" %>
<!-- 网上书城下方显示 start -->
</body>
</html>

