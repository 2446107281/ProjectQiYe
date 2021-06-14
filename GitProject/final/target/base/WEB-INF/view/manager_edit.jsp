<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2021/6/14
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/managers/edit" method="post">
    <p><input type="hidden" name="manager_id" value=${entity.manager_id}></p>
    <p>用户名 <input type="text" name="publicName" value=${entity.publicName}></p>
    <p>账号 <input type="text" name="userName" value=${entity.userName}></p>
    <p>密码<input type="text" name="password" value=${entity.password}></p>
    <p>联系方式<input type="text" name="contact" value=${entity.contact}></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
<a href="">待审核任务</a>
</body>
</html>
