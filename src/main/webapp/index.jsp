<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Online Voting System</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
<%@include file="navbar.jsp" %>
  
<div class="form-container">
<form action="VoterLogin" method="post">
<h3>Enter your Voter Card Number</h3>
<h3><label for="voterNumber"> Voter ID : </label></h3>
<input name="voterNumber" id="voterNumber" type="text" placeholder="Enter your ID"> 
<br>
<button type="submit">Login</button>
<h3> <a href="adminwelcome.jsp">Admin</a></h3>
</form>
</div>

</body>
</html>