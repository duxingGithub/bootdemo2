<%--
  Created by IntelliJ IDEA.
  User: 杜星
  Date: 2021/9/7
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<form method="post" action="/check_user.do" >
    账号:<input type="text" id="uname" name="uname"><br>
    密码:<input type="password" id="passwd" name="passwd"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
