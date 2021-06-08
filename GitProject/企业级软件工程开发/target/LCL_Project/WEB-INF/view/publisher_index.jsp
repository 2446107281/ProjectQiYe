<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/8
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <td style="border: 1px solid black" cellspacing="1">地址</td>
        <td style="border: 1px solid black" cellspacing="1">密码</td>
        <td style="border: 1px solid black" cellspacing="1">操作</td>
    </tr>
    <c:forEach items="${customers}" var="customer">
        <tr>
            <td style="border: 1px solid black" cellspacing="1">${customer.id}</td>
            <td style="border: 1px solid black" cellspacing="1">${customer.password}</td>
            <td style="border: 1px solid black" cellspacing="1">${customer.userName}</td>
            <td style="border: 1px solid black" cellspacing="1">${customer.address}</td>
            <td style="border: 1px solid black" cellspacing="1"><a href="/customer/edit?id=${customer.id}" >编辑</a></td>
            <td style="border: 1px solid black" cellspacing="1"><a href="/customer/delete?id=${customer.id}" >删除</a></td>
        </tr>
    </c:forEach>
    <tr><td><a href="/customer/edit">注册</a></td></tr>
</table>
</body>
</html>
