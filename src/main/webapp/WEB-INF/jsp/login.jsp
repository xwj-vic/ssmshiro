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
</head>

<body>
<br><br><br>
    <div align="center">
        <h1>登录</h1>
        <br><br><br>
        <form action="/login" method="POST">
            用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username" placeholder="请输入用户名"><br><br><br>
            密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password" placeholder="请输入密码"><br><br>
            验&nbsp;&nbsp;证&nbsp;&nbsp;码：<input type="text" name="verifyCode" placeholder="请输入验证码"/>
            <img src="/kaptcha.jpg" id="kaptchaImage" title="看不清，点击换一张" onclick="changeVerifyCode()"><br><br>
            <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消">
        </form>
    </div>
</body>
</html>