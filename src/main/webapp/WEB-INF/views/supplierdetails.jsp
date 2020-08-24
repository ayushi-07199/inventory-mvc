<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>Supplier Details</title>
</head>
<body>

<h1>Supplier Details </h1>

id is <c:out value="${supplier.id}"  />
<br>
name is <c:out value="${supplier.name}"  />

</body>
</html>