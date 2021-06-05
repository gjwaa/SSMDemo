<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <c:set var="ctx" scope="application" value="${pageContext.request.contextPath}"/>
    <title>登录</title>
    <script src="${ctx}/js/jquery-3.6.0.js"></script>
    <script src="${ctx}/js/login.js"></script>
</head>

<body>
<%--<form action="${ctx}/opt?action=login" method="post" onsubmit="return checkFrom()">--%>
    <input type="text" name="acc"><br>
    <input type="text" name="pwd"><br>
    <input type="text" name="verify">
    <img src="${ctx}/verify" alt="" id="verifyImg">
    <a href="javascript:changeImg();">看不清楚</a><br>
    <input type="button" id="login" value="登录">
<%--</form>--%>
<a href="view/regis.jsp">点击注册</a>


</body>


</html>