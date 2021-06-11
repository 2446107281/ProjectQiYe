<%--
  Created by IntelliJ IDEA.
  User: 11703
  Date: 2019/11/1
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="/numgoods/add" method="post">
    <p>物资编号<input type="text" name="userName" value="${numgoods.id}"></p>
    <p>物资数量<input type="text" name="password" value="${numgoods.rcount}"></p>
    <p>物资总价<input type="text" name="password" value="${numgoods.rsum}"></p>
    <p>仓库号<input type="text" name="password" value="${numgoods.warehouse}"></p>
    <p><input type="submit" name="login" value="完成"></p>
</form>
</body>
</html>
