<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>

</head>
<%@include file="navbar.jsp" %>
<body>
<div class="registerForm">
<form action="RegisterVoter" method="post">
<h3> Registration Form</h3>

<label for="name" ><b>Name :</b></label>
<br>
<input id="name" name="name" type="text"/>
<br>
<label for="number" ><b>Phone Number :</b></label>
<br>
<input id="number" name="number"  type="number"/>
<br>
<label for="email" ><b>Email :</b></label>
<br>
<input id="email" name="email"   type="email"/>
<br>
<label for="voternumber"><b>Voter Card Number :</b></label>
<br>
<input id="voternumber" name="voternumber"  type="text">
<br>
<label for="address" ><b>Address : </b></label>
<br>
<input id="address" name="address"  type="text"/>
<br>
<label for="dob" ><b>Date of Birth :</b></label>
<br>
<input id="dob" name="dob"  type="date">
<br>
<button type="Submit" >Register</button>
</form>
</div>
</body>
</html>