<%--
  Created by IntelliJ IDEA.
  User: ？？？
  Date: 2020/10/26
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer/edit" method="post">
    <p><input type="hidden" name="id" value=${entity.id}></p>
    <p>用户名 <input type="text" name="userName" value=${entity.userName}></p>
    <p>密码<input type="text" name="password" value=${entity.password}></p>
    <p>地址<input type="text" name="address" value=${entity.address}></p>
    <p><input type="submit" name="submit" value="submit"></p>
</form>
</body>
</html>
