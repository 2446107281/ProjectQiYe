<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    </tr>
    <c:forEach items="${tasks}" var="task">
        <tr>
            <td style="border: 1px solid black" cellspacing="1">${task.task_id}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskProfile}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskContent}</td>
            <td style="border: 1px solid black" cellspacing="1">${task.taskCost}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
