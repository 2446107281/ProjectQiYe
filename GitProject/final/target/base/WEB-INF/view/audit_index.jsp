<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 19:55
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
        <td style="border: 1px solid black" cellspacing="1">任务id</td>
        <td style="border: 1px solid black" cellspacing="1">审核者id</td>

    </tr>
    <c:forEach items="${audits}" var="audit">
    <tr>
        <td style="border: 1px solid black" cellspacing="1">${audit.task_id}</td>
        <td style="border: 1px solid black" cellspacing="1">${audit.manager_id}</td>
    </tr>
    </c:forEach>
</body>
</html>
