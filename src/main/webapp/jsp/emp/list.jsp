<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>显示全部员工页面</title>
</head>
<body>
<h1>显示全部员工页面</h1>
<a href="${pageContext.request.contextPath}/emp/addPageEmp">添加员工</a>
<table border="1"   width="80%" cellspacing="0" cellpadding="0">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>地址</th>
        <th>生日</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${empList}" var="emp">
        <tr align="center">
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.address}</td>
            <td>${emp.birthday}</td>
            <td>
                <a href="${pageContext.request.contextPath}/emp/deleteEmp/${emp.id}">删除</a>
                <a href="${pageContext.request.contextPath}/emp/updatePageEmp/${emp.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
