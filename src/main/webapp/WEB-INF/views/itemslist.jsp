<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %>

<!DOCTYPE html>
<html>
<head>
<title>ITEMS LIST</title>
</head>
<body>
<h1 align="center">ITEMS LIST</h1>
<table border="5px solid black" width="50%">
 <tr>
    <th>ID</th>
    <th>ITEM NAME</th>
    <th>SUPPLIER ID</th>
  </tr>
<v:forEach items="${items}" var="item">
<tr align="center">
    <td><v:out value="${item.id}"/></td>
    <td><v:out value="${item.name}"/></td>
    <td><v:out value="${item.supplier.id}"/></td>
</v:forEach>
  </tr>
</table>
</html>