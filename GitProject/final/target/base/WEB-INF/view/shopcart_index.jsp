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
                url:"/product/shopcart_list",
                type:"POST",
                // dataType:"json",//json一种文件格式
                success:function (data) {
                    var all=0 ;
                    var s = "<p>共有订单"+data.length+"</p>"+
                            "<p>商品名 价格 描述 数量 总价</p>" ;
                    for (var i = 0;i<data.length;i++)
                    {
                        s += "<p>"+data[i].product.productName+
                            " "+data[i].product.price+
                            " "+data[i].product.description+
                            " "+data[i].count+
                            " "+data[i].count*data[i].product.price+
                            " "+" <a href='#' onclick='order("+data[i].id+");'>删除</a>"+
                            "</p>"
                        all += data[i].count*data[i].product.price;
                    }
                    s += "<p>所有总价"+all+"</p>"
                    $("#content").html(s);
                }
            });
        }
        function order(id)
        {
            $.ajax({
                url:"/product/order",
                type:"post",
                dataType:"text",//json一种文件格式
                data:{id:id},
                success:function (data) {
                    if (data == "ok")
                    {
                        alert("您的商品已放入购物车！");
                    }
                    else{alert("放入购物车失败")}
                }
            });
        }
        $(function () {
            load();
        });
    </script>
</head>
<body>
<div id="content"></div>
<a href="/order/submit">结算</a>
</body>
</html>
