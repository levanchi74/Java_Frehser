
<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
</head>
<body>
	<jsp:include page="./header.jsp"/>
		

        
        <form action="" method ="POST" class="auth-form">
        	<h4 class="center-obj">Login Form</h4>
        	<small>Current UserName: ${cur_username}</small><br>
        	<small>Current Password: ${cur_password} </small>
        	<table class="auth-fields">
        		
        		<tr>
        			<td>UserName</td>
        			<td> <input type ="text" name = "username" value=${username}></td>
        		</tr>
        		<tr>
        			<td>Password</td>
        			<td><input type="text" name = "password" value =${password}></td>
        		</tr>
        		<tr><td colspan="2" class="message-err center-obj">${err}</td></tr>
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