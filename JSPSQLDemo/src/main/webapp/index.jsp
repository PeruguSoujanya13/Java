<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<sql:setDataSource var="ProductAdd" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/ProductAdd" user="root" password="Perugu@1329#13" />

<sql:query dataSource="${ProductAdd}" sql="SELECT * FROM ProductDetails "	var="result" />

<table border=1>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Price</th>
	</tr>

	<c:forEach var="row" items="${result.rows}">
		<tr>
			<td><c:out value="${row.id}" /></td>
			<td><c:out value="${row.name}" /></td>
			<td><c:out value="${row.price}" /></td>

		</tr>

	</c:forEach>


</table>