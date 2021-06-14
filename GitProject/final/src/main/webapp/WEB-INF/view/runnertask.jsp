<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 11:18
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
    <caption align="top">任务信息</caption>
    <tr>
        <td style="border: 1px solid black" cellspacing="1">任务id</td>
        <td style="border: 1px solid black" cellspacing="1">任务概要</td>
        <td style="border: 1px solid black" cellspacing="1">任务内容</td>
        <td style="border: 1px solid black" cellspacing="1">任务金额</td>
        <td style="border: 1px solid black" cellspacing="1">任务状态</td>
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td style="border: 1px solid black" cellspacing="1">${task.task_id}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskProfile}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskContent}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskCost}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskState}</td>
            <td><a href="/task/finish?task_id=${task.task_id}">任务完成</a> </td>
        </tr>
    </c:forEach>
</table>
<a href="/runner/edit?runner_id=${runner_id}">我的信息</a>
</body>
</html>
