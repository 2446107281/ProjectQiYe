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
        function deleteProduct(id) {
            if(!confirm("确认删除吗？"))
                return;
            $.ajax({//$是一个对象;
                url:"product/delete",
                type:"POST",  //与controller中RequestMethod是对应的
                dataType:"text", //返回值类型
                data:{productId: id}, //传参,给传过来的id起名productId
                success:function (ret){
                    alert(ret);
                }
            });

        }
        function load() {
            $.ajax({
                url:"/product/list",
                type:"GET",
                dataType:"json",//json一种文件格式
                success:function (data) {
                    var s = "<p>共有商品"+data.length+"</p>";
                    for (var i = 0;i<data.length;i++)
                    {
                        s += "<p>"+data[i].id+
                            " "+data[i].productName+
                            " "+data[i].price+
                            " "+" <a href='#' onclick='order("+data[i].id+");'>放入购物车</a>"+
                            "</p>"
                    }
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
<a href="/product/shopcart">访问购物车</a>
<div id="content">
</div>
</body>
</html>
