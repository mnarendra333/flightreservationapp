<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

${flightObj.operatingAirlines}

<c:out value="${flightObj.operatingAirlines}"></c:out>
<c:out value="${flightObj.depatureCity}"></c:out>
<c:out value="${flightObj.arrivalCity}"></c:out>
<c:out value="${flightObj.dateOfDepature}"></c:out>
<c:out value="${flightObj.estimatedDepatureTime}"></c:out>


<div>

	<h2>Passenger Details</h2>

	<form action="${pageContext.request.contextPath}/reservation/bookTicket" method="post">
		<input type="hidden" name="fid" value="${flightObj.id}">
		<pre>
		First Name : <input type="text" name="firstName">
		
		Last Name : <input type="text" name="lastName">
		
		middleName : <input type="text" name="middleName">
		
		email : <input type="text" name="email">
		
		mobileNo : <input type="text" name="mobileNo">
		
		
		
		<h2>Payment Details</h2>
		Card No : <input type="text" name="cardNo">
		
		Expiry Date : <input type="text" name="expDate">
		
		CVV : <input type="text" name="cvv">
		
		Name of the CardHolder : <input type="text" name="name">
		<input type="submit" value="book ticket"/>
		</pre>
	</form>


</div>