<%--
  Created by IntelliJ IDEA.
  User: Gjw
  Date: 2021/5/25
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:set var="ctx" scope="application" value="${pageContext.request.contextPath}"/>
    <title>登录</title>
    <script src="${ctx}/js/jquery-3.6.0.js"></script>
    <script src="${ctx}/js/admin.js"></script>
</head>

<body>
<%--<form action="${ctx}/admin" method="post" onsubmit="return checkFrom()">--%>
    <input type="text" name="acc"><br>
    <input type="text" name="pwd"><br>
    <input type="text" name="verify">
    <img src="${ctx}/verify" alt="" id="verifyImg">
    <a href="javascript:changeImg();">看不清楚</a><br>
    <input type="button" id="login" value="登录">
<%--</form>--%>

</body>

</html>
