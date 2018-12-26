<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src='<c:url value="/res/js/jquery-3.3.1.js "/>'></script>
<script type="text/javascript">
	jQuery(document).ready(function(){
		jQuery(".confirm").on("click", function(){
			return confirm("Si elimina este elemento no se podrá recuperar. ¿Continuar?")
		});
	});
</script>
</head>
<body>
	<h1>Admin!!!</h1>

	Atributo del Model: <c:out value="${mensaje}" />

	<sf:form action="${pageContext.servletContext.contextPath}/admin/save"
		method="POST" modelAttribute="admin">
		<table>
			
			<c:if test="${admin.idAd ne 0}">
				<sf:input path="idAd" type="hidden"/>
				<sf:input path="fechaCreacion" type="hidden" />			
			</c:if>
			
			<tr>
				<td>Nombre</td>
				<td><sf:input path="nombre" type="text" /></td>
			</tr>
			<tr>
				<td>Cargo</td>
				<td><sf:input path="cargo" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Guardar cambios" /></td>
			</tr>
		</table>
	</sf:form>
	<br />

	<c:out value="${resultado}"></c:out><br/><br/>

	<c:forEach items="${admins}" var="admin">
		<c:out value="${admin}"></c:out>
		<a href='<c:url value="/admin/${admin.idAd}/update"/>'>Actualizar</a>
		<a class="confirm" href='<c:url value="/admin/${admin.idAd}/delete"/>'>Eliminar</a>
		<br/>
	</c:forEach>

</body>
</html>