<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/6 0006
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="/js/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(function(){
            load();
        });

        function load() {
            $.ajax({
                url: "/major/getall",
                type: "get",
                dataType: "json",
                success: function (data){
                    $("#majors").html(data[0].majorName);
                }
            });
        }
    </script>
</head>
<body>
 <table cellspacing="0">
     <tr>
         <td style="border: 1px solid #000">姓名</td>
         <td style="border: 1px solid #000">密码</td>
         <td style="border: 1px solid #000">专业</td>
         <td style="border: 1px solid #000">操作</td>
     </tr>
     <c:forEach items="${users}" var="user">
         <tr>
             <td style="border: 1px solid #000">${user.name}</td>
             <td style="border: 1px solid #000">${user.password}</td>
             <td style="border: 1px solid #000">${user.major.majorName}</td>
             <td style="border: 1px solid #000">
                 <a href="/user/edit?id=${user.id}">编辑</a>
             </td>
         </tr>
     </c:forEach>
 </table>

 <div id="majors"></div>

</body>
</html>
