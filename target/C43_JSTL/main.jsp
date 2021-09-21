<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 04.08.2021
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<c:if test="${sessionScope.user == null}">
</c:if>
<c:if test="${sessionScope.user != null}">
<form action="/calc" method="post">
    <div class="input-group">
        <span class="input-group-text">Calculation</span>
        <input type="number" aria-label="Value 1" class="form-control" name="num1">
        <input type="number" aria-label="Value 2" class="form-control" name="num2">
        <select class="form-select" aria-label="Default select example" name="operation">
            <option selected>Choose operation</option>
            <option value="1">Sum</option>
            <option value="2">Difference</option>
            <option value="3">Multiply</option>
            <option value="4">Divide</option>
        </select>
        <button class="btn btn-secondary">Submit</button>
    </div>
</form>
<p>Result = ${requestScope.result}</p>
</c:if>
</body>
</html>
