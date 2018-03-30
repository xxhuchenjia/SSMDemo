<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>注册</title>
</head>
<body>
    <h2>用户注册</h2>
    <form method="post" action="user/reg">
        <p>用户名：<input name="userName" required></p>
        <p>密码：<input type="password" name="userPwd" required></p>
        <p>真实姓名：<input name="realName"></p>
        <p>出生日期：<input type="date" name="birthday"></p>
        <p style="color: red">${msg}</p>
        <p><input type="submit" value="注册"></p>
    </form>
</body>
</html>
