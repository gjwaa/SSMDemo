<%--
  Created by IntelliJ IDEA.
  User: Gjw
  Date: 2021/5/26
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <c:set var="ctx" scope="application" value="${pageContext.request.contextPath}"/>
    <title>Title</title>
    <script src="${ctx}/js/jquery-3.6.0.js"></script>

</head>
<body>
    <input type="text" id="name">

    <script>
        $(function (){
            $("#name").blur(function (){
                $.ajax({
                    url:"${ctx}/ajax",
                    data:{
                        "name":$("#name").val()
                    },
                    dataType:"text",
                    type:"post",
                    success:function (data1,status1){
                        console.log(data1),
                        console.log(status1)
                    }
                })
            });
        })
    </script>
</body>
</html>
