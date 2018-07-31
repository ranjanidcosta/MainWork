<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<caption>List of Magic Shows</caption>
		<thead>
			<tr>
				<!--       <th>Show ID</th> -->
				<th>Show Name</th>
				<th>Location</th>
				<th>Date</th>
				<th>Price</th>
				<th>Available Seats</th>
				<th>Book</th>
			</tr>
		</thead>
		<tbody>
			<s:forEach var="show" items="${showList}">
				<tr>
					<!--    <td>${show.showId}</td>  -->
					<td>${show.showName}</td>
					<td>${show.location}</td>
					<td>${show.showDate}</td>
					<td>${show.priceTicket}</td>
					<td>${show.availableSeats}</td>
					<s:choose>
						<s:when test="${show.availableSeats!=0}">
							<td><a href="./getShowDetails?showid=${show.showId}">Book Now</a></td>
						</s:when>
						<s:when test="${show.availableSeats==0}">
							<td>Sold Out</td>
							</s:when>
					</s:choose>

				</tr>
			</s:forEach>
		</tbody>
	</table>
</body>
</html>