<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <script type="text/javascript">
        function changeVerifyCode() {
            var time=new Date().getTime();
            document.getElementById("kaptchaImage").src="/kaptcha?d="+time;//为了不让验证码缓存，为了安全起见，需要次次都刷新
        }
    </script>
    <link  rel="stylesheet" type="text/css" href="styles/login.css"/>
    <link rel="stylesheet" type="text/css" href="styles/fontshiny.css">
    <link rel="stylesheet" type="text/css" href="styles/animate.min.css">
</head>

<body style="background-color: #50a3a2">
<script type="text/javascript" color="255,255,255" opacity='0.7' zIndex="-2" count="200" src="js/canvas-nest.js"></script>
    <div class="container">
        <div class="animated bounceIn">
            <span class="intro">伟杰后台系统登录</span>
        </div>
        <br><br><br>
        <form action="/login" method="POST" class="form">
            <input type="text" name="username" placeholder="请输入用户名/账号">
            <input type="password" name="password" placeholder="请输入密码">
            <input type="text" name="verifyCode" placeholder="请输入验证码"/><br><br>
            <img src="/kaptcha.jpg" id="kaptchaImage" title="看不清，点击换一张" onclick="changeVerifyCode()"><br><br><br><br>
            <input type="submit" value="登录">
            <input type="reset" value="取消">
        </form>
    </div>
</body>
</html>