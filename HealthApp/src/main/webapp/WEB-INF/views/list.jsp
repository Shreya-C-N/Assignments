<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LIST</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<style>
    body{
        background-image: url("https://wallpapercave.com/wp/wp2919299.jpg");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
    }
</style>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body style="background-color:skyblue;">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			th:src="@{/images/logo.png}" src="../static/images/logo.png"
			width="auto" height="40" class="d-inline-block align-top" alt="" />
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto"></ul>
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="/index">HOME PAGE</a></li>
					
				

			</ul>

		</div>
	</div>
	</nav>
<!-- 	<form> -->

<!-- <div class="w-75" align="center"> -->
<h2>List Of Patients</h2>
<table  class="table table-striped">
<thead>
<tr>
<td>Id</td>
<td>Name</td>
<td>Age</td>
<td>Blood Group</td>
<td>Disease</td>
<td>Previous History</td>
<td>Temperature</td>
<td>Blood Pressure</td>
<td>Pulse Rate</td>
</tr>
</thead>
<tbody>
<c:forEach items="${p}" var="p">
<tr>
  <td><a href="/updatePatientDetails/${p.id}">${p.id}</a></td> 

<td>${p.name}</td>
<td>${p.age}</td>
<td>${p.bloodgroup}</td>
<td>${p.disease}</td>
<td>${p.previous_history}</td>
<td>${p.temperature}</td>
<td>${p.blood_pressure}</td>
<td>${p.pulse_rate}</td>
</tr>
</c:forEach>
</tbody>
</table>
<!-- </form> -->
<!-- </div> -->
</body>
</html>
<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			th:src="@{/images/logo.png}" src="../static/images/logo.png"
			width="auto" height="40" class="d-inline-block align-top" alt="" />
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto"></ul>
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="/index">Home Page</a></li>
				

			</ul>

		</div>
	</div>
	</nav>
	<form>
<!-- <div class="w-75" align="center"> -->
<h2>
List Of Patients</h2>

<table class="table table-dark table-striped">

<thead>
<tr>
<td>Id</td>
<td>Name</td>
<td>Age</td>
<td>Blood Group</td>
<td>Disease</td>
<td>Previous History</td>
<td>Temperature</td>
<td>Blood Pressure</td>
<td>Pulse Rate</td>
</tr>
</thead>
<tbody>
<c:forEach items="${a}" var="p">
<tr>
 <td><a href="/index/${p.id }">${p.id}</a></td>  
 <td>${p.id}</td>

 <td>${p.name}</td>
<td>${p.age}</td>
<td>${p.bloodgroup}</td>
<td>${p.disease}</td>
<td>${p.previous_history}</td>
<td>${p.temperature}</td>
<td>${p.blood_pressure}</td>
<td>${p.pulse_rate}</td>
</tr>
</c:forEach>
</tbody>

</table>
</form>
<!-- </div> -->
</body>
</html> --%>