<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>Add computers</h1>
<form method="get" action="/computerdetails">
<label>enter computer name</label>
<input type="text"  name="cname">
<br>
<label>enter the size</label>
<input type="number" name="size">
<br>
<input type="submit" value="add computer">
</form>
</body>
</html>