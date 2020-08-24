<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>Login Page</h1>
<form method="get" action="/processlogin">
<div>
<label>Id</label>
<input type="number"  name="id">
</div>
<div>
<label>Password</label>
<input type="password"  name="password">
</div>
<input type="submit" value="LOGIN">
</form>
</body>
</html>