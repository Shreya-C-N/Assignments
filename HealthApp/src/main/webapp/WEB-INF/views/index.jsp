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
<center><h1>WELCOME</h1></center>

<center><h3>WHO ARE YOU?</h3></center>
<form action="/home" method="get">
<input type="submit" name="submit" value="STAFF"/><br/>
 </form>
<h1> </h1>
  <form action="/doctorhome" method="get"> 
<input type="submit" name="submit" value="DOCTOR"/><br/>
</form>
</body>
</html>