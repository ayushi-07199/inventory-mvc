<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1 align="center" >COMPUTERS LIST</h1>
<table border="0" width="50%">
 <tr>
    <th>ID</th>
    <th>COMPUTERS</th>
    <th>DISK SIZE</th>
  </tr>
<v:forEach items="${computers}" var="computer">

<tr align="center">
    <td><v:out value="${computer.id}"/></td>
    <td><v:out value="${computer.name}"/></td>
    <td><v:out value="${computer.diskSize}"/><span>GB</span></td>
</v:forEach>
  </tr>
</table>
</html>