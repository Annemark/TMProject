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
<title>Choice</title>

</head>
<body>
<h1>Hello  ${nom } ${prenom } ${pseudo } , Choisis ton animal:</h1>
<h2></h2>

<form action="" method="post">

<label for="choice1"><img src="https://www.wanimo.com/veterinaire/images/articles/chat/chaton-diarrhee.jpg" width="100"/></label>
<input type="radio" name="choice1" id="choice1" />

<label for="choice2"><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQodZYm7zZkzdbFQ75q0APRjl6hBTk3fLtKlvQywMBuwN08CBCw" width="100"/></label>
<input type="radio" name="choice2" id="choice2" />


</form>

</body>
</html>