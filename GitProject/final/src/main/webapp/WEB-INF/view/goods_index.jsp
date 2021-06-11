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
                url:"/goods/list",
                type:"GET",
                dataType:"json",//json一种文件格式
                success:function (data) {
                    var s ;
                    for (var i = 0;i<data.length;i++)
                    {
                        s += "<p>"+data[i].id+
                            " "+data[i].name+
                            " "+data[i].type+
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
<a>物资库</a>
<a href="/goods/ingoods">入库物资库</a>
<a href="/goods/outgoods">出库物资库</a>
<a href="/goods/numgoods">剩余物资库</a>
<form action="/goods/seek" method="post">
    <input type="text" name="userName" value="">(请输入物资编号)
    <p><input type="submit" name="seek" value="查询"></p>
</form>
<div id="content">
</div>
<a href="/goods/add">添加</a>
</body>
</html>
