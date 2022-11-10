<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<body>
<center><h1>DOCTOR DETAILS</h1></center>

<form action="/doctor" method="post">
<table>

<tr>Name:</tr><br/>
<tr><input width="300" height="100" name="name" type="text" /></tr><br/><br/>
<tr>Doctor's Comment:</tr><br/>
<tr><input name="doctor_comments" type="text" /></tr><br/><br/>
</table>
<input name="submit" value="SUBMIT" type="submit"/> 
</body>
</html>