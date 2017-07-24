<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Sobe</h1>

			<p class="lead">Ovo je spisak svih trenutno dostupnih soba!</p>
		</div>

		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-success">
					<th>Hotel</th>
					<th>Broj kreveta</th>
					<th>Velicina sobe</th>
					<th>Ima kupatilo</th>
					<th>Ima klima</th>
					<th>Ima tv</th>
					<th>Cena po danu</th>
					<th></th>
				</tr>
			</thead>
			<c:forEach items="${sveSobe}" var="soba">
				<tr>
					<td>${soba.hotel.naziv}</td>
					<td>${soba.brojKreveta}</td>
					<td>${soba.velicina}</td>
					<td>${soba.imaKupatilo?"Da":"Ne"}</td>
					<td>${soba.imaKlima?"Da":"Ne"}</td>
					<td>${soba.imaTv?"Da":"Ne"}</td>
					<td>${soba.cenaPoDanu} EUR</td>
					
					<td><a href="<spring:url value="/soba/${soba.sobaId}" />">
							<span class="glyphicon glyphicon-info-sign"></span>
					</a>
					<a href="<spring:url value="/deleteSoba/${soba.sobaId}" />">
							<span class="glyphicon glyphicon-remove"></span>
					</a>
					<a href="<spring:url value="/editSoba/${soba.sobaId}" />">
							<span class="glyphicon glyphicon-pencil"></span>
					</a></td>
				</tr>
			</c:forEach>
		</table>

		<br>
		
		<a href="<spring:url value="/addSoba"/>" class="btn btn-primary">Dodaj sobu</a>
		
		<br>
		
		<%@include file="/WEB-INF/views/template/footer.jsp"%>