<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/audit/update" method="post">
    <p>任务id<input type="text" name="task_id" value=${task.task_id}></p>
    <p>任务概要 <input type="text" name="taskProfile" value=${task.taskProfile}></p>
    <p>任务内容 <input type="text" name="taskContent" value=${task.taskContent}></p>
    <p>任务金额<input type="text" name="taskCost" value=${task.taskCost}></p>
    <p>发布者id<input type="text" name="publisher_id" value=${task.publisher_id}></p>
    <p>发布状态<input type="text" name="taskPublicState" value="${task.taskPublicState}"></p>
    <p>任务状态<input type="text" name="taskState" value="${task.taskState}"></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
</body>
</html>
