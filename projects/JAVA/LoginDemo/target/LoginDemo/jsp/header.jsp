<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>ChiLe</title>
        <link rel="stylesheet" href ="./assets/bootstrap.min.css">
        <link rel="stylesheet" href ="./assets/main.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	  <a class="navbar-brand" href="./">CHILE</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav mr-auto">
	      <li class="nav-item active">
	        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="#">Link</a>
	      </li>
	    </ul>
	    
	    <% if(session.getAttribute("username")==null){ %>
	   		<a href="./login" style="margin-right: 30px">LOGIN</a>
	   	<% } else { %>
	   		<a href ="./profile" style="margin-right:30px;">${username}</a>
	   		<a href="./logout" style="margin-right:30px;">Logout</a>
	   	<%} %>
	  </div>
	</nav>
</body>
</html>