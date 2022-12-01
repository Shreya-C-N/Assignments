<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <div class="title">LOGIN FORM</div>
                <form action="/adminlogin" method="post">
                    <c:if test="${not empty error}">
                <div style="color:red;"><h3>${error}</h3></div>
                    </c:if>
                  <c:if test="${not empty success}">
                <div style="color:green;"><h3>${success}</h3></div>
                    </c:if>
               
                <div class="field">
                 <label>Username</label>
                    <input name="username" type="text" />
     
        
                </div>
                
                <div class="field">
                 <label>Password</label>
                    <input name="password" type="password" />
            
                </div>
               
                <div class="field">
                    <input type="submit" value="LOGIN" name="submit"  />
                </div>
                
                     <div class="field">
                        <input name="submit" value="CLEAR" type="reset"  />
                    </div>
</body>
</html>