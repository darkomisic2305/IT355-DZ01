<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Detalji o hotelu</h1>

			<p class="lead">Ovde mozete videti detalje o odabranom hotelu!</p>
		</div>

		<div class="container" use-expressions="true">
			<div class="row">

				<div class="col-md-12">
					<p>
						<strong>Naziv</strong> : ${hotel.naziv}
					</p>
					<p>
						<strong>Adresa</strong> : ${hotel.adresa} m2
					</p>
					<p>
						<strong>Kategorija</strong> : ${hotel.kategorija}
					</p>

					<br>




				</div>


				<h2>Spisak soba</h2>

				<p class="lead">Ovo je spisak svih trenutno dostupnih soba u
					hotelu ${hotel.naziv}!</p>

				<table class="table table-striped table-hover">
					<thead>
						<tr class="bg-success">
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
							<td>${soba.brojKreveta}</td>
							<td>${soba.velicina}</td>
							<td>${soba.imaKupatilo?"Da":"Ne"}</td>
							<td>${soba.imaKlima?"Da":"Ne"}</td>
							<td>${soba.imaTv?"Da":"Ne"}</td>
							<td>${soba.cenaPoDanu}EUR</td>

							<td><a href="<spring:url value="/soba/${soba.sobaId}" />">
									<span class="glyphicon glyphicon-info-sign"></span>
							</a></td>
						</tr>
					</c:forEach>
				</table>

				<br>
				<p>
					<a href="<c:url value="/sviHoteli" />" class="btn btn-default">Povratak
						na spisak hotela</a>
				</p>
			</div>
		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>