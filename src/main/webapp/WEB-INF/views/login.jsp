<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<%@include file="/WEB-INF/views/template/header.jsp"%>
<div class="container">
	<h1>Uloguj se:</h1>
	<c:if test="${not empty error}">
		<div class="error">${error}</div>
	</c:if>
	<c:if test="${not empty msg}">
		<div class="error">${msg}</div>
	</c:if>
	
	<form name="loginForm" action="<c:url value="/j_spring_security_check" />" method="post">
		<table>
			<tr>
				<td>User:</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" class="btn btn-primary" /></td>
			</tr>
		</table>
		
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	
	<%@include file="/WEB-INF/views/template/footer.jsp"%>
</div>

<!-- NE RADI WEBFLOW

<html>
<body>
	<h2>Please Login</h2>
	<form method="post" action="${flowExecutionUrl}">
		<input type="hidden" name="_eventId" value="performLogin"> <input
			type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		Enter Username<input type="text" name="userName" maxlength="40"><br>
		Enter Password <input type="password" name="password" maxlength="40">
		<input type="submit" value="Login" />
	</form>
</body>
</html>

 -->