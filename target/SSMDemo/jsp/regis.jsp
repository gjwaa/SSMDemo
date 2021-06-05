<%--
  Created by IntelliJ IDEA.
  User: Gjw
  Date: 2021/5/25
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>

    <title>${ctx}</title>
    <script src="${ctx}/js/jquery-3.6.0.js"></script>
    <link rel="stylesheet" href="${ctx}/css/regis.css">
    <link rel="shortcut icon" href="#"/>
    <script>
        function checkFrom() {
            var acc = $("[name='acc']").val();
            var pwd = $("[name='pwd']").val();
            var rePwd = $("[name='rePwd']").val();
            var phone = $("[name='phone']").val();
            var email = $("[name='email']").val();
            if (pwd == rePwd) {
                if (acc == "" || pwd == "" || phone.val() == "" || email.val() == "") {
                    alert("字段不能为空");
                    return false;
                } else {
                    return true;
                }
            } else {
                alert("两次密码不一致");
                return false;
            }

        }

        $(function () {
            $("#regis").click(function () {
                return checkFrom();
            });

            $("[name='acc']").blur(function () {
                $.post({
                    url:"${ctx}/ajax",
                    data:{"acc":$("[name='acc']").val()},
                    dataType:"text",
                    success:function (data){
                        if(data=="true"){
                            $("#accTip").html("该账号已被注册")
                        }else if(data=="false"){
                            $("#accTip").html("该账号可以注册")
                        }
                    }
                })
            });

        });
    </script>

</head>
<body>
<div class="panel">


    <div class="content">
        <img src="${ctx}/images/ad.jpg" alt="">
        <div style="width: 100% ; height: auto; background-color: rgb(99, 117, 199) ;"><span style="color: #fff;">会员注册&gt;&gt;&gt;</span>
        </div>
        <div class="content-form">
            <form action="${ctx}/opt?action=regis" method="post" onsubmit="return checkFrom()">
                <span>用户：</span><input name="acc" type="text" style="width: 100px;"><span id="accTip"></span><br><br>
                <span>密码：</span><input name="pwd" type="password" style="width: 100px;"><br><br>
                <span>确认密码：</span><input name="rePwd" type="password" style="width: 100px;"><br><br>
                <span>手机：</span><input name="phone" type="text" style="width: 100px;"><br><br>
                <span>邮箱：</span><input name="email" type="text" style="width: 100px;"><br><br>
                <input type="submit" value="注册" id="regis">&nbsp;&nbsp;
                <input type="reset" value="重置">
            </form>
        </div>
    </div>


</div>
</body>
<script>
    var error = '<%=request.getParameter("error")%>';
    if (error == 'yes') {
        alert("注册失败！");
    } else if (error == 'no') {
        alert("注册成功！")
    }
</script>
</html>
