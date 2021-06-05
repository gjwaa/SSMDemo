<%-- Created by IntelliJ IDEA. User: Gjw Date: 2021/5/26 Time: 10:20 To change this template use File | Settings | File
    Templates. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>后台管理</title>
    <link rel="stylesheet" href="${ctx}/css/admin.css">
    <script src="${ctx}/js/jquery-3.6.0.js"></script>
    <script>
        $(function () {
            $("#addProduct").click(function () {
                $("#addProductDiv").show();
            })
        })
    </script>
</head>

<body>
<div class="intro">

    <div class="head">
        <div style="background-color: rgb(116, 116, 241); height: 10px; "></div>
        <b style="font-size: 50px;">在线拍卖后台管理系统</b>
        <div style="float: right; text-align: right; font-size: 18px;">
            <a href="#">退出系统</a><br>
            <b>账号：admin&nbsp;&nbsp;账户级别：系统管理员</b><br><br>
        </div>
        <div class="time">
            <b style="width: 100%;">系统时间2014年1月10:00:00</b>
        </div>
    </div>

    <div class="left">
        <p
                style="background-color: rgb(116, 116, 241);color: white; height: 30px;margin: 0; font-size: 18px; text-align: center;">
            操作菜单</p>

        <div>
            <a href="javascript:onClick=show('1')"><img src="${ctx}/images/folder.png"/>商品管理</a>
        </div>
        <div id="1">
            <img src="${ctx}/images/line.png"> <a href="#" id="addProduct">添加商品</a><br>
            <img src="${ctx}/images/line.png"> <a href="#" id="maintainInfo">维护商品信息</a><br>
        </div>

        <div>
            <a href="javascript:onClick=show('2')"><img src="${ctx}/images/folder.png">分类管理</a>
        </div>
        <div id="2">
            <img src="${ctx}/images/line.png"><a href="">添加分类</a><br>
            <img src="${ctx}/images/line.png"><a href="">维护分类信息</a><br>

        </div>

    </div>

    <div class="body">

        <div id="addProductDiv">
            <form method="post" action="${ctx}/adminAdd" enctype="multipart/form-data">
                <table border="1">
                    <tr>
                        <td>商品名</td>
                        <td><input type="text" name="name"></td>
                    </tr>
                    <tr>
                        <td>起拍价</td>
                        <td><input type="text" name="startPrice"></td>
                    </tr>
                    <tr>
                        <td>所属类型</td>
                        <td>
                            <select name="type" id="">
                                <option value="1">艺术品</option>
                                <option value="2">品品品</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>图片</td>
                        <td>
                            <input type="file" name="loadFile">
                        </td>
                    </tr>
                    <tr>
                        <td>商品简介</td>
                        <td><input type="textarea" name="introduce"></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="添加"></td>
                    </tr>
                </table>
            </form>
        </div>

        <div id="vipInfo">
            <p style="margin: 0;">首页》》会员管理》》维护会员信息</p>
            <p style="background-color: rgb(116, 116, 241);font-size: 20px;">维护会员信息</p>
            <table class="table" border="2">
                <tr>

                    <td style="width: 110px;">编号</td>
                    <td style="width: 110px;">会员名</td>
                    <td style="width: 110px;">Email</td>
                    <td style="width: 110px;">联系电话</td>
                    <td style="width: 180px;">操作</td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>qq</td>
                    <td>sds</td>
                    <td>122222</td>
                    <td><img src="${ctx}/images/folder.png" alt=""><a href="#">重置密码</a>&nbsp;<img
                            src="${ctx}/images/folder.png" alt=""><a href="#">删除</a></td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>qq</td>
                    <td>sds</td>
                    <td>122222</td>
                    <td><img src="${ctx}/images/folder.png" alt=""><a href="#">重置密码</a>&nbsp;<img
                            src="${ctx}/images/folder.png" alt=""><a href="#">删除</a></td>
                </tr>
                <tr>
                    <td>1</td>
                    <td>qq</td>
                    <td>sds</td>
                    <td>122222</td>
                    <td><img src="${ctx}/images/folder.png" alt=""><a href="#">重置密码</a>&nbsp;<img
                            src="${ctx}/images/folder.png" alt=""><a href="#">删除</a></td>
                </tr>
            </table>

            <div class="page">
                <p>共3条 当前页数： 第一页</p>
            </div>
        </div>

    </div>


    <script>
        function show(d1) {
            if (document.getElementById(d1).style.display == 'none') {
                document.getElementById(d1).style.display = 'block';
            } else {
                document.getElementById(d1).style.display = 'none';
            }
        }
    </script>

</div>
</body>

</html>