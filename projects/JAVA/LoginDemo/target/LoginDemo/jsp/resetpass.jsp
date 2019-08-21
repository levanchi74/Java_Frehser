<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
</head>
<body>
	<jsp:include page="./header.jsp"/>
	
	
    <form action="" method ="POST" class="auth-form">
    	<h4 class="center-obj">Reset Password Form</h4>
    	<table class="auth-fields">
    		
    		<tr>
    			<td>Old Password</td>
    			<td> <input type ="text" name = "pass" value="${pass}"></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td class="message-err">${pass_err}</td>
    		</tr>
    		
    		<tr>
    			<td>New Password</td>
    			<td><input type="text" name = "newPass" value ="${newPass}"></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td colspan="2" class="message-err center-obj">${newPass_err}</td>
    		</tr>
    		
    		<tr>
    			<td>Password Confirm</td>
    			<td><input type="text" name = "confirmPass" value ="${confirmPass}"></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td colspan="2" class="message-err center-obj">${confirmPass_err}</td>
    		</tr>
    		
    		<tr>
    			<td colspan="2" class="center-obj auth-btn">
    				<input type="submit" value="LOGIN" class="btn btn-success"> 
    				<a href="./" class="btn btn-danger">Back</a>
    			</td>
    		</tr>
    	</table>
    
    </form>
</body>
</html>