<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2021/6/13
  Time: 15:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/publisher/edit" method="post">
    <p>跑腿小哥id<input type="text" name="runner_id" value=${entity.runner_id}></p>
    <p>用户名 <input type="text" name="publicName" value=${entity.publicName}></p>
    <p>账号 <input type="text" name="userName" value=${entity.userName}></p>
    <p>密码<input type="text" name="password" value=${entity.password}></p>
    <p>联系方式<input type="text" name="contact" value=${entity.contact}></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
    <a href="/task/all">任务大厅</a>
<a href="/task/runner?runner_id=${entity.runner_id}">我的任务</a>
</body>
</html>
