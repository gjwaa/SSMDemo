
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: GJW
  Date: 2021/5/23
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>id</td>
        <td>acc</td>
        <td>pwd</td>
    </tr>

    <c:forEach items="${sessionScope.userList}" var="userInfo" >
        <tr>
            <td>${userInfo.getUid()}</td>
            <td>${userInfo.getAcc()}</td>
            <td>${userInfo.getPwd()}</td>
        </tr>
    </c:forEach>


</table>



</body>
</html>
