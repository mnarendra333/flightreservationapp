<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="/user/register" method="post">
	
		<pre>
		
			FirstName : <input type="text" name="firstName"/>
			
			LastName : <input type="text" name="lastName"/>
			
			Email : <input type="email" name="email"/>
			
			Password : <input type="password" name="password"/>
			
			Confirm Password : <input type="password" name="confirmPassword"/>
			
			<input type="submit" value="register"/>
		
		
		</pre>
	
	
	</form>

</body>
</html>