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
<center><h1>Login Page</h1></center><br/>
<h1>Enter your Username and Password to proceed..</h1>
<h2></h2>
 <form action="/doctorlogin" method="post">
Username:<input name="username" type="text" /><br/><br/>
Password:<input name="password" type="text" /><br/><br/>
<input name="submit" value="LOGIN" type="submit"/> 
</form>
</body>
</html>