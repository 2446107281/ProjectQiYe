<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/8
  Time: 15:28
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
    <c:forEach items="${publishers}" var="publishers">
         <tr>
             <td style="border: 1px solid black" cellspacing="1">${publishers.publisher_id}</td>
             <td style="border: 1px solid black" cellspacing="1">${publishers.publicName}</td>
             <td style="border: 1px solid black" cellspacing="1">${publishers.userName}</td>
             <td style="border: 1px solid black" cellspacing="1">${publishers.password}</td>
             <td style="border: 1px solid black" cellspacing="1"><a href="/publisher/edit?id=${publishers.publisher_id}" >编辑</a></td>
             <td style="border: 1px solid black" cellspacing="1"><a href="/publisher/delete?id=${publishers.publisher_id}" >删除</a></td>
         </tr>
     </c:forEach>
 <tr><td><a href="/publisher/edit">注册</a></td></tr>
</table>
</body>
</html>
