<%@include file="/WEB-INF/views/template/header.jsp"%>
	
	<div class="container-wrapper">
		<div class="container">
	
			<h1>Zdravo, korisnice!</h1>
			<h1>${message}</h1>
			
			
			<sec:authorize access="hasRole('ROLE_USER')">
				<c:url value="/j_spring_security_logout" var="logoutUrl" />
				<form action="${logoutUrl}" method="post" id="logoutForm">
					<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
				</form>
				<script>
					function formSubmit() {
						document.getElementById("logoutForm").submit();
					}
				</script>
				
				<c:if test="${pageContext.request.userPrincipal.name != null}">
					<h2>Vase korisnicko ime je: ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()">Logout</a> </h2>
				</c:if>
			</sec:authorize>
		
			<%@include file="/WEB-INF/views/template/footer.jsp"%>
		
	