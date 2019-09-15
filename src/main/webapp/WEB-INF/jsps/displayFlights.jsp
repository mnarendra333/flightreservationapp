<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
	
		<c:forEach items="${flightList}" var="flight">
			<tr>
			
				<td>${flight.flightNumber}</td>
				<td>${flight.operatingAirlines}</td>
				<td>${flight.depatureCity}</td>
				<td>${flight.arrivalCity}</td>
				<td>${flight.dateOfDepature}</td>
				<td>${flight.estimatedDepatureTime}</td>
				<td><a href="confirmBooking?fid=${flight.id}">book</a></td>
			
			</tr>
		
		</c:forEach>
	
	
	</table>


</body>
</html>