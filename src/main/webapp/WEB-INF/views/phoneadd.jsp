<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="v" %>

<!DOCTYPE html>
<html>
<head>
<title>add phones</title>
</head>
<body>
<h1 align="center">Enter phone details</h1>
<form method="get" action="/addphone">
<br>
<label>Enter phone name</label>
<input type="text" name="name">
<br>
<label>Enter the size</label>
<input type="number" name="size">
<br>
<label>Enter the suppliers name</label>
<input type="text" name="supplier">
<br>
<input type="submit" value="add the phone">
</form>


</body>
</html>