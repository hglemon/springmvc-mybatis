<%--
  Created by IntelliJ IDEA.
  User: lifei.ding
  Date: 15-6-25
  Time: 上午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>register account</title>
</head>
<body>
  <div>
    <c:forEach items="${userInfo}" var="pw">
      <p>${pw.type}</p>
      <p>${pw.uid}</p>
    </c:forEach>
  </div>
</body>
</html>
