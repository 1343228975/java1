<%--
  Created by IntelliJ IDEA.
  User: 赵伦
  Date: 2021-12-22
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<HTML>
<HEAD>
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="${pageContext.request.contextPath}/admin/css/Style.css"
          rel="stylesheet" type="text/css" />
    <script language="javascript"
            src="${pageContext.request.contextPath}/admin/js/public.js"></script>

</HEAD>
<body>
<br />
<form id="Form1" name="Form1" action="" method="post">
    <table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
        <tbody>
        <tr>
            <td class="ta_01" align="center" bgColor="#afd1f3">
                <strong>商家列表</strong>
            </td>
        </tr>
        <tr>
            <td class="ta_01" align="right">
                <button type="button" id="add" name="add" value="&#28155;&#21152;" class="button_add" onclick="addNotice()">
                    &#28155;&#21152;
                </button>
            </td>
        </tr>
        <tr>
            <td class="ta_01" align="center" bgColor="#f5fafe">
                <table cellspacing="0" cellpadding="1" rules="all"
                       bordercolor="gray" border="1" id="DataGrid1"
                       style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
                    <tr
                            style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
                        <td align="center" width="12%">编号</td>
                        <td align="center" width="12%">姓名</td>
                        <td align="center" width="24%">电话</td>
                        <td align="center" width="8%">邮件</td>
                        <td width="8%" align="center">删除</td>

                    </tr>
                    <c:forEach items="${bus}" var="n">
                        <tr onmouseover="this.style.backgroundColor = 'white'" onmouseout="this.style.backgroundColor = '#F5FAFE';">
                            <td style="CURSOR: hand; HEIGHT: 22px" align="center"
                                width="23">${n.id }</td>
                            <td style="CURSOR: hand; HEIGHT: 22px" align="center"
                                width="18%">${n.name }</td>
                            <td style="CURSOR: hand; HEIGHT: 22px" align="center"
                                width="8%">${n.telphone }</td>
                            <td style="CURSOR: hand; HEIGHT: 22px" align="center"
                                width="8%">${n.email }</td>
                            <td align="center" style="HEIGHT: 22px" width="7%">
                                <a href="${pageContext.request.contextPath}/DeleteBusServlet?id=${n.id}">
                                    <img src="${pageContext.request.contextPath}/admin/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
                                </a>
                            </td>

                        </tr>
                    </c:forEach>
                </table>
            </td>
        </tr>
        </TBODY>
    </table>
</form>
</body>
</HTML>