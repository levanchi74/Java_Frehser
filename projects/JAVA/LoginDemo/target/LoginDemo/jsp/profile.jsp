<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
</head>
<body>
	<jsp:include page="./header.jsp"/>
	<div class="welcome-text">
		<h3>SessionID: ${sessionId}   </h3>
        <h3>UserName: ${username}     </h3>
        <a href="./" class="btn btn-danger">Back</a>
	</div>
        
</body>
</html>