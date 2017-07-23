<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Detalji o hotelu</h1>

			<p class="lead">Ovde mozete videti detalje o odabranom hotelu!</p>
		</div>

		<div class="container" use-expressions="true">
			<div class="row">
				
				<div class="col-md-5">
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
									
					<p>
						<a href="<c:url value="/sviHoteli" />" class="btn btn-default">Nazad</a>
					</p>
				</div>
			</div>
		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>