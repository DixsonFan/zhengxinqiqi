<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加一名员工</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/emp/addEmp">
    <h1>添加一名员工</h1>
    姓名:<input type="text" name="name" />
    地址:<input type="text" name="address" />
    生日:<input type="text" name="birthday" placeholder="输入格式为年-月-日" />
    <button type="submit">提交</button>
</form>
</body>

</html>
