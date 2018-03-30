<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td colspan="2">用户详细信息</td>
        </tr>
        <tr>
            <td>用户名</td>
            <td>${item.userName}</td>
        </tr>
        <tr>
            <td>真实姓名</td>
            <td>${item.realName}</td>
        </tr>
        <tr>
            <td>出生日期</td>
            <td>${item.birthday}</td>
        </tr>
    </table>
</body>
</html>
