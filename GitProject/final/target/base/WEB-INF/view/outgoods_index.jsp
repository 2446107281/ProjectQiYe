<%--
  Created by IntelliJ IDEA.
  User: 11703
  Date: 2019/11/1
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        function load() {
            $.ajax({
                url:"/outgoods/list",
                type:"GET",
                dataType:"json",//json一种文件格式
                success:function (data) {
                    var s ;
                    for (var i = 0;i<data.length;i++)
                    {
                        s += "<p>"+data[i].id+
                            " "+data[i].outcount+
                            " "+data[i].outprice+
                            " "+data[i].outtime+
                            " "+data[i].operator+
                            " "+data[i].keeper+
                            " "+data[i].remark+
                            " "+" <a href='#' onclick='update("+data[i].id+");'>修改</a>"+
                            "</p>"
                    }
                    $("#content").html(s);
                }
            });
        }
        $(function () {
            load();
        });
    </script>
</head>
<body>
<a href="/outgoods/goods">物资库</a>
<a href="/outgoods/ingoods">入库物资库</a>
<a>出库物资库</a>
<a href="/outgoods/numgoods">剩余物资库</a>
<form action="/outgoods/seek" method="post">
    <input type="text" name="userName" value="">(请输入物资编号)
    <p><input type="submit" name="seek" value="查询"></p>
</form>
<div id="content">
</div>
<a href="/outgoods/add">添加</a>
</body>
</html>
