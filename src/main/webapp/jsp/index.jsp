<%--
  Created by IntelliJ IDEA.
  User: Gjw
  Date: 2021/5/25
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
    <script src="${ctx}/js/jquery-3.6.0.js"></script>

    <link href="${ctx}/css/index.css" rel="stylesheet">
</head>
<body>
<div class="panel">
    <div class="title">
        <div class="nav-top"></div>
        <h1 style="color: rgb(99, 117, 199);">在线竞拍系统</h1>
        <div class="nav">
            <ul>
                <li><a href="#">首页</a></li>
                <li><a href="#">竞拍中的商品</a></li>
                <li><a href="#">我的竞拍</a></li>
                <li><a href="#">会员注册</a></li>
            </ul>
        </div>
    </div>

    <div class="left">
        <div class="left-top">
            <div style="background-color: rgb(99, 117, 199); width: 100%;height: 15%;">
                <span>会员登录</span>
            </div>
            <form action="">
                <span>用户：</span><input type="text" style="width: 70px;"><br>
                <span>密码：</span><input type="password" style="width: 70px;"><br><br>
                <input type="submit" value="登录">&nbsp;&nbsp;
                <input type="reset" value="重置">
            </form>
        </div>
        <div class="left-top">
            <div style="background-color: rgb(99, 117, 199); width: 100%;height: 15%;">
                <span>拍卖商品分类</span>
            </div>

            <section id="conter">
                <section id="help-left">
                    <!--open为展开菜单，close为折叠菜单-->
                    <details class="menu" close>
                        <summary>商品管理</summary>
                        <ul>
                            <li><a href="#">添加商品</a></li>
                            <li><a href="#">22222</a></li>
                        </ul>
                    </details>

                </section>
                <section id="help-right"></section>
            </section>


        </div>

        <div class="left-top">
            <div style="background-color: rgb(99, 117, 199); width: 100%;height: 15%;">
                <span>竞拍系统公告</span>
            </div>
            <p style="color: purple;">在线竞拍系统上线</p>
            <p style="text-align: left;">&nbsp;&nbsp;&nbsp;&nbsp;1111111111111111111111111111111</p>
        </div>
    </div>

    <div class="content">
        <img src="../images/ad.jpg" alt="">
        <div style="width: 100% ; height: auto; background-color: rgb(99, 117, 199) ;"><span
                style="color: #fff;">最近热卖商品&gt;&gt;&gt;</span>
        </div>
        <div class="allShow">
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>
            <div class="content-show">
                <img src="${ctx}/images/phone.jpg" alt="">
                <div class="info">
                    <p>苹果手机</p>
                    <p>起拍价￥9999</p>
                    <p>状态:竞拍成功</p>
                    <div class="detail">
                        <a href="#">详情</a>
                        <img src="${ctx}/images/show.png" alt="">
                    </div>
                </div>
            </div>

        </div>
    </div>



</div>
</body>
</html>
