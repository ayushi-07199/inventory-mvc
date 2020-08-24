<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>Add supplier(get request)</h1>
<form method="get" action="/processaddsupplier">
<label>enter supplier name</label>
<input type="text"  name="supname">
<br>
<label>enter the password</label>
<input type="password" name="password">
<br>
<input type="submit" value="add supplier">
</form>
</body>
</html>