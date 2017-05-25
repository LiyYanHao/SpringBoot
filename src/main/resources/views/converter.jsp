<%--
  Created by IntelliJ IDEA.
  User: lyh
  Date: 17-5-24
  Time: 下午4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <menu http-equiv="Content-type" content="text/html; charset=UTF-8"/>
    <title>HttpMessageConverter Demo</title>
</head>
<body>
    <div id="resp"></div>
    <input type="button" onclick="req();" value="请求"/>
    <script src="/assets/js/jquery-3.2.0.js" type="text/javascript"></script>
    <script>
        function req() {
            $.ajax({
                url:"convert",
                data:"lasdasdas-wangyufei",
                type:"POST",
                contentType:"application/x-wisely",
                success:function (data) {
                    alert("123");
                    $("#resp").html(data);
                }
            })
        }
    </script>
</body>
</html>
