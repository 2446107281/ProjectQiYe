<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/13
  Time: 15:49
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
        <td style="border: 1px solid black" cellspacing="1">任务发布状态</td>
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td style="border: 1px solid black" cellspacing="1">${task.task_id}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskProfile}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskContent}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskCost}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskState}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskPublicState}</td>
        </tr>
    </c:forEach>
</table>
<p></p>
<p>任务状态:1:空闲；2：进行中；3：已完成</p>
<p>任务发布状态： ：未审核；1：已公开；2：拒绝公开</p>
<p><a href="/task/edit?publisher_id=${publisher_id}">发布任务</a></p>
<p><a href="/publisher/edit?id=${publisher_id}">我的信息</a></p>
</body>
</html>
