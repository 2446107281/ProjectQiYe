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
<form action="/goods/add" method="post">
    <p>物资编号<input type="text" name="userName" value="${goods.id}"></p>
    <p>物资名称<input type="text" name="password" value="${goods.name}"></p>
    <p>规格型号<input type="text" name="password" value="${goods.type}"></p>
    <p>类别<input type="text" name="password" value="${goods.sort}"></p>
    <p>计量单位<input type="text" name="password" value="${goods.meas}"></p>
    <p><input type="submit" name="login" value="完成"></p>
</form>
</body>
</html>
