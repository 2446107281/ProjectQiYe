<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13 0013
  Time: 18:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/plugin/jquery-ui-1.12.1.custom/jquery-ui.css">
    <script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript" src="/plugin/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
    <script type="text/javascript" >
        $(function() {
            load();

            $( "#dialog-form" ).dialog({
                autoOpen: false,
                height: 300,
                width: 350,
                modal: true,
                buttons: {
                    "确定": function() {
                        onCreate();
                    },
                    "取消": function() {
                        $( this ).dialog( "close" );
                    }
                }
            });
            $("#dialog-form" ).dialog("open");
        });

        function onCreate() {
            $.ajax({
                url: "/major/create",
                type: "POST",
                dataType: "text", /*传参数*/
                data: {majorName: $("#majorName").val()}, /**/
                success: function (da) {
                    if (da == "0") {
                        alert("创建成功！");
                        $('#dialog-form').dialog("close");
                        load();
                    }
                    else {
                        alert("操作失败");
                    }
                }
            });
        }

        function load() {
            $.ajax({
                url: "/major/getall",
                type: "get",
                dataType: "json",
                success: function (data){
                    var s = "<table>";
                    s += "<tr><td>ID</td><td>名称</td></tr>";
                    for (var i = 0; i < data.length; i++) {
                        s += "<tr>";
                        s += "<td>" + data[i].id + "</td>";
                        s += "<td>" + data[i].majorName + "</td>";
                        s += "</tr>"

                    }
                    s += "</table>";
                    $("#majors").html(s);
                }
            });
        }
    </script>
</head>
<body>
<div id="majors"></div>
<div id="dialog-form" title="专业">
    <p class="validateTips">请输入专业名称</p>

    <form>
        <fieldset>
            <label for="majorName">专业名称</label>
            <input type="text" name="majorName" id="majorName" class="text ui-widget-content ui-corner-all">
        </fieldset>
    </form>
</div>
</body>
</html>
