<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<body>
<!-- <div class="w-75" align="center"> -->
<h2>
List Of Doctor's Comments</h2>
<table class="table table-dark table-striped">
<thead>
<tr>
<td>Id</td>
<td>Name</td>
<td>Doctor Comment</td>

</tr>
</thead>
<tbody>
<c:forEach items="${b}" var="d">
<tr>
<%--  <td><a href="/index/${p.id }">${p.id}</a></td>  --%> 
 <td>${d.id}</td>

 <td>${d.name}</td>
<td>${d.doctor_comments}</td>

</tr>
</c:forEach>
</tbody>
</table>
<!-- </div> -->
</body>
</html>