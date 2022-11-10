<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Successful</h1>

 <form action="/list" method="get">
<input name="submit" value="PATIENT'S DETAILS" type="submit"/> 
</form>
<br/><br/>
 <form action="/patientdetails" method="get">
<input name="submit" value="PATIENT'S REGISTRATION" type="submit"/> 
</form>
<br/><br/>
 <form action="/doctorlist" method="get">
<input name="submit" value="DOCTOR'S COMMENTS ON PATIENT" type="submit"/> 
</form>
</body>
</html>