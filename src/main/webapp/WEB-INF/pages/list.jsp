<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2022/6/12
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${accounts}" var="account">
    ${account.id}-------${account.username}---------${account.password}<br>
</c:forEach>
</body>
</html>
