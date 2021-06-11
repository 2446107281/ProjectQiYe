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
<form action="/ingoods/add" method="post">
    <p>物资编号<input type="text" name="userName" value="${ingoods.id}"></p>
    <p>入库数量<input type="text" name="password" value="${ingoods.incount}"></p>
    <p>入库价格<input type="text" name="password" value="${ingoods.inprice}"></p>
    <p>入库时间<input type="text" name="password" value="${ingoods.intime}"></p>
    <p>经办人<input type="text" name="password" value="${ingoods.operator}"></p>
    <p>保管人<input type="text" name="password" value="${ingoods.keeper}"></p>
    <p>备注<input type="text" name="password" value="${ingoods.remark}"></p>
    <p><input type="submit" name="login" value="完成"></p>
</form>
</body>
</html>
