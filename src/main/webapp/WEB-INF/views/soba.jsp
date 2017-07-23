<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Detalji o sobi</h1>

			<p class="lead">Ovde mozete videti detalje o odabranoj sobi!</p>
		</div>

		<div class="container" use-expressions="true">
			<div class="row">
				
				<div class="col-md-5">
					<p>
						<strong>Broj kreveta</strong> : ${soba.brojKreveta}
					</p>
					<p>
						<strong>Velicina</strong> : ${soba.velicina} m2
					</p>
					<p>
						<strong>Ima kupatilo</strong> : ${soba.imaKupatilo?"Da":"Ne"}
					</p>
					<p>
						<strong>Ima klima</strong> : ${soba.imaKlima?"Da":"Ne"}
					</p>
					<p>
						<strong>Ima tv</strong> : ${soba.imaTv?"Da":"Ne"}
					</p>
					<p>
						<strong>Cena po danu</strong> : ${soba.cenaPoDanu} EUR
					</p>
					<br>
									
					<p>
						<a href="<c:url value="/sveSobe" />" class="btn btn-default">Nazad</a>
					</p>
				</div>
			</div>
		</div>

		<%@include file="/WEB-INF/views/template/footer.jsp"%>