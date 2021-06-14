<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16 0016
  Time: 9:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form action="/user/edit" method="post">
    <input type="hidden" name="id" value="${user.id}"/>
    <p>用户名: <input type="text" name="name" value="${user.name}"/></p>
    <p>密码: <input type="password" name="password" value="${user.password}"/></p>
    <p>性别: <input type="radio" name="sex" value="0" checked="checked"/>男
        <input type="radio" name="sex" value="1" />女
    </p>
    <p>
        爱好：<input type="checkbox" name="hobby" value="game"/>游戏
        <input type="checkbox" name="hobby" value="basketball"/>打球
        <input type="checkbox" name="hobby" value="movie"/>电影
    </p>
    <p>
        专业：
        <select name="major">
            <option value="math">数学</option>
            <option value="english">英语</option>
            <option value="computer">计算机</option>
        </select>
    </p>
    <p>
        简介:
        <textarea name="intro" cols="30" rows="10">
                ${user.intro}
            </textarea>
    </p>
    <p><input type="submit" name="editBtn" value="修改" /></p>
</form>
</body>
</html>
