<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/deal/accept" method="post">
    <p>任务id <input type="text" name="taskProfile" value=${entity.task_id}></p>
    <p>小哥id <input type="text" name="taskContent" value=${entity.runner_id}></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
</body>
</html>
