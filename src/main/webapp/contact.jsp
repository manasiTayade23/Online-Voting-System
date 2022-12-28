<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ContactUs</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<%@include file="navbar.jsp" %> 
<body>
<div class="form-container-contact">
<form action="Contact" method="post">
<h3>Please Fill The Information</h3>
<h3><label for="Name"> Name </label></h3>
<input name="Name" id="Name"type="text"> 
<h3><label for="phoneNo"> Contact No </label></h3>
<input name="phoneNo" id="phoneNo" type="text"> 

<h3><label for="email"> Email ID</label></h3>
<input name="email" id="email" type="email"> 

<h3>Comments</h3>
<textarea name="comments" id="comments" rows="2" cols ="8"></textarea>
<br>
<button type="submit">Submit</button>

</form>
</div>
</body>
</html>