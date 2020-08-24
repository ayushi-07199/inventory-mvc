<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>Add phones</h1>
<form method="get" action="/phonedetails">
<label>enter phone name</label>
<input type="text"  name="pname">
<br>
<label>enter the size</label>
<input type="number" name="size">
<br>
<input type="submit" value="addphone">
</form>
</body>
</html>