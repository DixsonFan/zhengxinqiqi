<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改单条数据</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/emp/update">
    <input type="hidden" name="id" value="${emp.id}" />
    <h1>修改一条数据</h1>
    姓名:<input type="text" name="name" placeholder="${emp.name}" />
    地址:<input type="text" name="address" placeholder="${emp.address}" />
    生日:<input type="text" name="birthday" placeholder="${emp.birthday}" />
    <button type="submit">提交</button>
</form>

</body>
</html>
