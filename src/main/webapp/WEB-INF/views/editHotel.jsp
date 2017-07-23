<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Izmeni hotel</h1>

			<p class="lead">Izmenite informacije o hotelu:</p>
		</div>

		<form:form action="${pageContext.request.contextPath}/editHotel" method="post" commandName="hotel">
		<form:hidden path="hotelId" value="${hotel.hotelId}"/>
			<div class="form-group">
				<label for="naziv">Naziv hotela:</label> <form:errors path="naziv" cssStyle="color: #ff0000"/>
				<form:input path="naziv" id="naziv" class="form-Control" value="${hotel.naziv}"/>
			</div>
			<div class="form-group">
				<label for=adresa>Adresa:</label> <form:errors path="adresa" cssStyle="color: #ff0000"/>
				<form:input path="adresa" id="adresa" class="form-Control" value="${hotel.adresa}"/>
			</div>
			<div class="form-group">
				<label for="kategorija">Kategorija:</label> <form:errors path="kategorija" cssStyle="color: #ff0000"/>
				<form:input path="kategorija" id="kategorija" class="form-Control" value="${hotel.kategorija}" />
			</div>
			
			<br><br>
			
			<input type="submit" value="Sacuvaj" class="btn btn-default">
			<a href="<c:url value="/sviHoteli"/>" class="btn btn-default">Odustani</a>
		</form:form>


		<%@include file="/WEB-INF/views/template/footer.jsp"%>