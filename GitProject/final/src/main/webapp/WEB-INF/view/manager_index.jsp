<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/6/14
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table style="border: 1px solid black" cellspacing="1">
    <caption align="top">用户信息</caption>
    <tr>
        <td style="border: 1px solid black" cellspacing="1">ID</td>
        <td style="border: 1px solid black" cellspacing="1">用户名</td>
        <td style="border: 1px solid black" cellspacing="1">账号</td>
        <td style="border: 1px solid black" cellspacing="1">密码</td>
        <td style="border: 1px solid black" cellspacing="1">操作</td>
    </tr>
    <c:forEach items="${managers}" var="managers">
        <tr>
            <td style="border: 1px solid black" cellspacing="1">${managers.manager_id}</td>
            <td style="border: 1px solid black" cellspacing="1">${managers.publicName}</td>
            <td style="border: 1px solid black" cellspacing="1">${managers.userName}</td>
            <td style="border: 1px solid black" cellspacing="1">${managers.password}</td>
            <td style="border: 1px solid black" cellspacing="1"><a href="/managers/edit?id=${managers.manager_id}" >编辑</a></td>
            <td style="border: 1px solid black" cellspacing="1"><a href="/managers/delete?id=${managers.manager_id}" >删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
