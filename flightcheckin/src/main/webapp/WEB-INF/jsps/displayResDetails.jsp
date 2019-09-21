<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<c:out value="${reservation.flight.flightNumber}"></c:out>
<c:out value="${reservation.flight.depatureCity}"></c:out>
<c:out value="${reservation.flight.arrivalCity}"></c:out>
<c:out value="${reservation.flight.dateOfDepature}"></c:out>
<c:out value="${reservation.flight.estimatedDepatureTime}"></c:out>


<c:out value="${reservation.passenger.firstName}"></c:out>
<c:out value="${reservation.passenger.lastName}"></c:out>
<c:out value="${reservation.passenger.middleName}"></c:out>
<c:out value="${reservation.passenger.email}"></c:out>
<c:out value="${reservation.passenger.mobileNo}"></c:out>

<form action="checkin" method="post">
	<h2>Check In Deatils</h2>
	No Of Bags : <input type="text" name="noOfBags" />
	
	<input type="hidden" name="id" value="${reservation.id}">
	 <input type="submit"
		value="checkin" />
</form>