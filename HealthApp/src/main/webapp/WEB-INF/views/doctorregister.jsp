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
<center><h1>Registration Page</h1></center><br/>
<h1>Enter required details</h1>
<h1></h1>
<form action="/doctorregister" method="post">
 <table>
<tr>Name:</tr><br/>
<tr><input name="name" type="text" /></tr><br/><br/>
<tr>Phone Number:</tr><br/>
<tr><input name="number" type="text" /></tr><br/><br/>
<tr>Email:</tr><br/>
<tr><input name="email" type="text" /></tr><br/><br/>
<tr>Username:</tr><br/>
<tr><input name="username" type="text" /></tr><br/><br/>
<tr>Password:</tr><br/>
<tr><input name="password" type="text" /></tr><br/><br/>
<tr>Confirm_Password:</tr><br/>
<tr><input name="confirmpassword" type="text" /></tr><br/><br/>
</table> 

<input name="submit" value="REGISTER" type="submit"/>

</form>
</body>
</html>