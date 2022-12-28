<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> AdminLogin</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<%@include file="navbar.jsp" %>
<div class="form-container-admin">
<form action="AdminLogin" method="post">
<h3>Please Fill The Information</h3>
<h3><label for="aName"> Name </label></h3>
<input name="aName" id="aName"type="text"> 
<h3><label for="password"> Password</label></h3>
<input name="password" id="password" type="password"> 
<br>
<h3><button type="submit">Login</button></h3>


</form>
</div>
</body>
</html>