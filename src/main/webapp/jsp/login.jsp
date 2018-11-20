<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=request.getScheme() + "://"
		+ request.getServerName() + ":"
		+ request.getServerPort()
		+ request.getContextPath() + "/"
		%>" />
		
<meta charset="ISO-8859-1">
<title>Login</title>

</head>



<body>

<h2>Login</h2>


<form method="post" action="login">
	
    Email: <input type="text" name="email" /> <br>
	Mot de passe:<input type="password" name="password"/><br>
	
	<input type="submit" value="S'identifier"/>
	
</form>

</body>
</html>