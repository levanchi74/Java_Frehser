<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html >
<html>
<head>
    <meta charset="UTF-8">
    <title>ChiLe</title>
    
</head>
<body>

	<jsp:include page="./header.jsp"/>
	<div class="welcome-text">
		<% if(session.getAttribute("username") == null){ %>
			<h3> Welcom to CHILE Shop. Please <a href="./login">login</a> to continue. </h3>
		<% } else { %>
			<h3> You logged in. View <a href ="./profile">profile</a> or <a href="./resetpass">Reset Password</a></h3> 
		<% } %>
	</div>

	
</body>
</html>
