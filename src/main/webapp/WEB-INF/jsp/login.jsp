<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>

<body>
<br><br><br>
    <div align="center">
        <h1>登录</h1>
        <br><br><br>
        <form action="/login" method="get">
            用&nbsp;&nbsp;户&nbsp;&nbsp;名：<input type="text" name="username"><br><br><br>
            密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"><br><br>
            <input type="submit" value="登录">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="取消">
        </form>
    </div>
</body>
</html>