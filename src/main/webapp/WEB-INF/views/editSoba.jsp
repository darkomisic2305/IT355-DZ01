<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Izmeni sobu</h1>

			<p class="lead">Izmenite informacije o sobi:</p>
		</div>

		<form:form action="${pageContext.request.contextPath}/editSoba" method="post" commandName="soba">
		<form:hidden path="sobaId" value="${soba.sobaId}"/>
			<div class="form-group">
				<label for="hotel">Hotel</label> <form:errors path="hotel" cssStyle="color: #ff0000"/>
				<form:select path="hotel.hotelId" class="form-Control">
					<form:option value="" label="Odaberite hotel..." />
					<form:options itemLabel="naziv" itemValue="hotelId" items="${hoteli}"/>
				</form:select>
			</div>
			<div class="form-group">
				<label for="name">Broj kreveta</label> <form:errors path="brojKreveta" cssStyle="color: #ff0000"/>
				<form:input path="brojKreveta" id="brojKreveta" class="form-Control" value="${soba.brojKreveta}"/>
			</div>
			<div class="form-group">
				<label for="name">Velicina sobe</label> <form:errors path="velicina" cssStyle="color: #ff0000"/>
				<form:input path="velicina" id="velicina" class="form-Control" value="${soba.velicina}"/>
			</div>
			<div class="form-group">
				<label for="imaKupatilo">Ima kupatilo: </label> 
				<label class="checkbox-inline"><form:radiobutton path="imaKupatilo" id="imaKupatilo" value="true" />Da</label>
				<label class="checkbox-inline"><form:radiobutton path="imaKupatilo" id="imaKupatilo" value="false" />Ne</label> 
			</div>
			<div class="form-group">
				<label for="imaKlima">Ima klima: </label> 
				<label class="checkbox-inline"><form:radiobutton path="imaKlima" id="imaKlima" value="true" />Da</label>
				<label class="checkbox-inline"><form:radiobutton path="imaKlima" id="imaKlima" value="false" />Ne</label> 
			</div>
			<div class="form-group">
				<label for="imaTv">Ima tv: </label> 
				<label class="checkbox-inline"><form:radiobutton path="imaTv" id="imaTv" value="true" />Da</label>
				<label class="checkbox-inline"><form:radiobutton path="imaTv" id="imaTv" value="false" />Ne</label> 
			</div>
			<div class="form-group">
				<label for="cenaPoDanu">Cena po danu:</label> <form:errors path="cenaPoDanu" cssStyle="color: #ff0000"/>
				<form:input path="cenaPoDanu" id="cenaPoDanu" class="form-Control" value="${soba.cenaPoDanu}" />
			</div>
			
			<br><br>
			
			<input type="submit" value="Sacuvaj" class="btn btn-default">
			<a href="<c:url value="/sveSobe"/>" class="btn btn-default">Odustani</a>
		</form:form>


		<%@include file="/WEB-INF/views/template/footer.jsp"%>