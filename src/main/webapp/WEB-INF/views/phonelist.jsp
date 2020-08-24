<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %>

<!DOCTYPE html>
<html>
<head>
<title>SUPPLIERS LIST</title>
</head>
<body>
<h1 align="center"  color="blue">PHONES LIST</h1>
<table border="0" width="50%">
 <tr>
    <th>ID</th>
    <th>PHONE NAME</th>
    <th>STORAGE SIZE</th>
  </tr>
<v:forEach items="${phones}" var="phone">

<tr align="center">
    <td><v:out value="${phone.id}"/></td>
    <td><v:out value="${phone.name}"/></td>
    <td><v:out value="${phone.storageSize}"/><span>GB</span></td>


</v:forEach>
  </tr>
</table>
</html>