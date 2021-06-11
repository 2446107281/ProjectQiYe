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
<form action="/outgoods/add" method="post">
    <p>物资编号<input type="text" name="userName" value="${outgoods.id}"></p>
    <p>入库数量<input type="text" name="password" value="${outgoods.outcount}"></p>
    <p>入库价格<input type="text" name="password" value="${outgoods.outprice}"></p>
    <p>入库时间<input type="text" name="password" value="${outgoods.outtime}"></p>
    <p>经办人<input type="text" name="password" value="${outgoods.operator}"></p>
    <p>保管人<input type="text" name="password" value="${outgoods.keeper}"></p>
    <p>备注<input type="text" name="password" value="${outgoods.remark}"></p>
    <p><input type="submit" name="login" value="完成"></p>
</form>
</body>
</html>
