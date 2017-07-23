<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Hoteli</h1>

			<p class="lead">Ovo je spisak svih hotela!</p>
		</div>

		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Naziv hotela</th>
					<th>Adresa</th>
					<th>Kategorija</th>
					<th></th>
				</tr>
			</thead>
			<c:forEach items="${sviHoteli}" var="hotel">
				<tr>
					<td>${hotel.naziv}</td>
					<td>${hotel.adresa}</td>
					<td>${hotel.kategorija}</td>

					<td><a href="<spring:url value="/hotel/${hotel.hotelId}" />">
							<span class="glyphicon glyphicon-info-sign"></span>
					</a>
					<a href="<spring:url value="/deleteHotel/${hotel.hotelId}" />">
							<span class="glyphicon glyphicon-remove"></span>
					</a>
					<a href="<spring:url value="/editHotel/${hotel.hotelId}" />">
							<span class="glyphicon glyphicon-pencil"></span>
					</a></td>
				</tr>
			</c:forEach>
		</table>
		
		<br>
		
		<a href="<spring:url value="/addHotel"/>" class="btn btn-primary">Dodaj hotel</a>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>