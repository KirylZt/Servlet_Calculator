<%--
  Created by IntelliJ IDEA.
  User: Home
  Date: 22.08.2021
  Time: 2:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>History</title>
</head>
<body>
<jsp:include page="_header.jsp"/>
<c:if test="${sessionScope.user == null}">
</c:if>
<c:if test="${sessionScope.user != null}">
<form action="/history" method="post">
    <button>submit</button>
<%--<table class="table table-striped">--%>
<%--    <table class="table">--%>
<%--        <thead>--%>
<%--        <tr>--%>
<%--            <th scope="col">#</th>--%>
<%--            <th scope="col">User</th>--%>
<%--            <th scope="col">Operation</th>--%>
<%--            <th scope="col">Result</th>--%>
<%--        </tr>--%>
<%--        </thead>--%>
<%--        <tbody>--%>
<%--        <tr>--%>
<%--            <c:forEach var="operation" items="${requestScope.operations}" >--%>
<%--                <th scope="row"></th>--%>
<%--            <td></td>--%>
<%--            <td></td>--%>
<%--            <td></td>--%>
<%--            </c:forEach>--%>
<%--        </tr>--%>
<%--        </tbody>--%>
<%--    </table>--%>
<%--</table>--%>
    <c:forEach var="operation" items="${requestScope.operations}" >
        <p>${operation}</p>
    </c:forEach>
    </c:if>
</form>
</body>
</html>
