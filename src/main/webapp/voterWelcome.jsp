<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome User</title>
</head>
<%@include file="navbar.jsp" %>
<body>
<div class="form-container-admin">
<form action="Vote" method="post">
<h3>Please Fill The Information</h3>
<h3><label for="votedId"> Voter ID </label></h3>
<input name="votedId" id="votedId"type="number"> 
<h3><label for="party"> Choose A Political Party</label></h3>
<select name="party" id="party">
<option value="aap">AAP</option>
<option value="bjp"> BJP</option>
<option value="congress">Congress</option>
<option value="cpi">CPI</option>
</select>
<br>
<h3><button type="submit">Submit</button></h3>


</form>
</div>
</body>
</html>