<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Flights</title>
</head>
<body>
	<h2>Show Flights</h2>
	
	
	<form action="${pageContext.request.contextPath}/flight/searchFlights" method="post">
		
		From : <input type="text" name="depatureCity">&nbsp&nbsp&nbsp&nbsp
		
		To : <input type="text" name="arrivalCity">&nbsp&nbsp&nbsp&nbsp
		
		DepartureTime : <input type="text" name="dateOfDepature">&nbsp&nbsp&nbsp&nbsp
		
		<input type="submit" value="search">
	
	</form>
</body>
</html>