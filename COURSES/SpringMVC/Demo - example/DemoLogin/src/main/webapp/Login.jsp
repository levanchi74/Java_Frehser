<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<script>
	function validateForm() {
		var myForm = document.forms['formLogin'];
		if (myForm.userName.value == '') {
			alert('enter your UserName');
			return false;
		}
		if (myForm.password.value == '') {
			alert('enter your password');
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<form action="login" name="formLogin" onsubmit="return validateForm();" method="Post">
		<table align="center" bolder=1>
			<tr>
				<td>UserName:</td>
				<td><input name="userName" type="text" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input name="password" type="text" /></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type=submit value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>