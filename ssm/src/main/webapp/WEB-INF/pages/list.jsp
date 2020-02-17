<%--
  Created by IntelliJ IDEA.
  User: ZRM
  Date: 2020/2/16
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
查到了所有用户了
<c:forEach items="${list}" var="account">
    ${account.name}
</c:forEach>
</body>
</html>
