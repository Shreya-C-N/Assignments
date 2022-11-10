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
<center><h1>PATIENT DETAILS</h1></center>

<form action="/patientdetails" method="post">
<table>

<tr>Name:</tr><br/>
<tr><input name="name" type="text" /></tr><br/><br/>
<tr>Age:</tr><br/>
<tr><input name="age" type="text" /></tr><br/><br/>
<tr>Blood_Group:</tr><br/>
<tr><input name="bloodgroup" type="text" /></tr><br/><br/>
<tr>Disease:</tr><br/>
<tr><input name="disease" type="text" /></tr><br/><br/>
<tr>Previous_History:</tr><br/>
<tr><input name="previous_history" type="text" /></tr><br/><br/>
<tr>Temperature:</tr><br/>
<tr><input name="temperature" type="text" /></tr><br/><br/>
<tr>Blood_Pressure:</tr><br/>
<tr><input name="blood_pressure" type="text" /></tr><br/><br/>
<tr>Pulse_Rate:</tr><br/>
<tr><input name="pulse_rate" type="text" /></tr><br/><br/>
</table><br/>
<input name="submit" value="SUBMIT" type="submit"/> 
</body>
</html>