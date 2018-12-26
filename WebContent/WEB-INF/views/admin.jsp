<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Admin!!!</h1>

	Atributo del Model: <c:out value="${mensaje}" />

	<sf:form action="${pageContext.servletContext.contextPath}/admin/save" method="POST" modelAttribute="admin">
		<table>
			<tr>
				<td>Nombre</td>
				<td><sf:input path="nombre" type="text"/></td>
			</tr>
			<tr>
				<td>Cargo</td>
				<td><sf:input path="cargo" type="text"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Guardar cambios"/></td>
			</tr>
		</table>
	</sf:form>
	<br/>
	
	<c:out value="${resultado}"></c:out>

</body>
</html>