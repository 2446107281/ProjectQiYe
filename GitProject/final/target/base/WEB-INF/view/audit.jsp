<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/14
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/audit/audit" method="post">
    <p>任务id <input type="text" name="task_id" value=${entity.task_id}></p>
    <p>管理者id <input type="text" name="manager_id" value=${entity.manager_id}></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
</body>
</html>
