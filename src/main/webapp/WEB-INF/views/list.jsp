<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>All Suppliers</title>
</head>
<body>

<h1>Listing all Suppliers</h1>


<c:forEach items="${suppliers}"  var="supplier">

<c:out value="${supplier.id}"  />

<c:out value="${supplier.name}"  />

<br>
</c:forEach>

</body>
</html>