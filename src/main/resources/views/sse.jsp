<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lyh
  Date: 17-5-25
  Time: 上午11:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>SEE Demo</title>
</head>
<body>
    <div id="msgFromPush"></div>
    <script type="text/javascript" src="<c:url value="/assets/js/jquery-3.2.0.js"/>"></script>
    <script type="text/javascript">
        if(!!window.EventSource){//EventSource只有新的浏览器才支持，Chrome,FireFox,EventSource是SSE客户端
            var source = new EventSource("push");
            var s = '';
            source.addEventListener('message',function (e) {//添加SSE客户端，在此获得服务端推送的消息
               s +=e.data + "<br/>";
               $("#msgFromPush").html(s);
            });
            source.addEventListener('error',function (e) {
                if(e.readyState == EventSource.CLOSED){
                    console.log("连接关闭");
                }else{
                    console.log(e.readyState)
                }

            })
        }else{
            console.log("你的浏览器不支持SSE");
        }
    </script>

</body>
</html>
