<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="shortcut icon" href="#" />
    <title>登录页面</title>
</head>
<body>
    <h1>登录页面</h1>
    <form action="${pageContext.request.contextPath}/login">
        用户名：<input type="text" name="username"> <br>
        密码：<input type="password" name="pwd"> <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
