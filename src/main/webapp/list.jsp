<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>列表</title>
</head>
<body>
    <table style="border: black 1px solid">
        <tr style="background-color: blue">
            <th>用户名</th>
            <th>真实姓名</th>
            <th>出生日期</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${users}" var="list">
        <tr>
            <td>${list.userName}</td>
            <td>${list.realName}</td>
            <td>${list.birthday}</td>
            <td><a href="user/findById/${list.userId}">查看</a></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
