<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Register</title>
</head>
<body>
<c:forEach items="${majors}" var="major">
    ${major.id} ${major.majorName}
</c:forEach>
    <form action="/user/register" method="post">
        <p>用户名: <input type="text" name="name" value=""/></p>
        <p>密码: <input type="password" name="password" value=""/></p>
        <p>确认密码: <input type="password" name="confirm" value=""/></p>
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
            <select name="majorId">
                <c:forEach items="${majors}" var="major">
                    <option value="${major.id}">${major.majorName}</option>
                </c:forEach>
            </select>
        </p>
        <p>
            简介:
            <textarea name="intro" cols="30" rows="10">
                请输入至少50个字符
            </textarea>
        </p>
        <p><input type="submit" name="registerBtn" value="注册" /></p>
    </form>
</body>
</html>
