<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
	function changePassword(){
		$.ajax({
			url: 'changePassword',
			data: {
				passOld: $('#passOld').val(),
				passNew: $('#passNew').val(),
			}
		}).done(function(kq){
			console.log(kq)
		});
	}
</script>
</head>
<body>
		<table>
			<tr>
				<td>password old:</td>
				<td><input type="text" id="passOld"/></td>
			</tr>
			<tr>
				<td>password new:</td>
				<td><input type="text" id="passNew"/></td>
			</tr>
			<tr>
				<td colspan="2"><button onclick="changePassword()">Change</button> </td>
			</tr>
		</table>
</body>
</html>